/*
 * MIT License
 *
 * Copyright (c) 2017 Frederik Ar. Mikkelsen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package fredboat.util;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.IMentionable;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.TextChannel;

import java.util.ArrayList;
import java.util.List;

public class ArgumentUtil {

    private ArgumentUtil() {
    }

    public static List<Member> fuzzyMemberSearch(Guild guild, String term) {
        ArrayList<Member> list = new ArrayList<>();

        term = term.toLowerCase();

        for (Member mem : guild.getMembers()) {
            if ((mem.getUser().getName().toLowerCase() + "#" + mem.getUser().getDiscriminator()).contains(term)
                    || (mem.getEffectiveName().toLowerCase().contains(term))
                    || term.contains(mem.getUser().getId())) {
                list.add(mem);
            }
        }

        return list;
    }

    public static List<Role> fuzzyRoleSearch(Guild guild, String term) {
        ArrayList<Role> list = new ArrayList<>();

        term = term.toLowerCase();

        for (Role role : guild.getRoles()) {
            if ((role.getName().toLowerCase()).contains(term)
                    || term.contains(role.getId())) {
                list.add(role);
            }
        }

        return list;
    }


    public static Member checkSingleFuzzyMemberSearchResult(TextChannel tc, String term) {
        List<Member> list = fuzzyMemberSearch(tc.getGuild(), term);

        switch (list.size()) {
            case 0:
                tc.sendMessage("Nothing found for `" + term + "`.").queue();
                return null;
            case 1:
                return list.get(0);
            default:
                String msg = "Multiple items were found. Did you mean any of these users?\n```";

                for (int i = 0; i < 5; i++) {
                    if (list.size() == i) break;
                    msg = msg + "\n" + list.get(i).getUser().getName() + "#" + list.get(i).getUser().getDiscriminator();
                }

                msg = list.size() > 5 ? msg + "\n[...]" : msg;
                msg = msg + "```";

                tc.sendMessage(msg).queue();
                return null;
        }
    }

    public static IMentionable checkSingleFuzzySearchResult(List<IMentionable> list, TextChannel tc, String term) {
        switch (list.size()) {
            case 0:
                tc.sendMessage("Nothing found for `" + term + "`.").queue();
                return null;
            case 1:
                return list.get(0);
            default:
                String msg = "Multiple items were found. Did you mean any of these users?\n```";

                for (IMentionable mentionable : list) {
                    if (mentionable instanceof Member) {
                        Member member = (Member) mentionable;
                        msg = msg + "\n" + "USER " + member.getUser().getId() + " " + member.getEffectiveName();
                    } else if (mentionable instanceof Role) {
                        Role role = (Role) mentionable;
                        msg = msg + "\n" + "USER " + role.getId() + " " + role.getName();
                    } else {
                        throw new IllegalArgumentException("Expected Role or Member, got " + mentionable);
                    }
                }

                msg = list.size() > 5 ? msg + "\n[...]" : msg;
                msg = msg + "```";

                tc.sendMessage(msg).queue();
                return null;
        }
    }

    public static String getSearchTerm(Message message, String[] args, int argsToStrip) {
        String raw = message.getRawContent();
        return raw.substring(raw.indexOf(args[argsToStrip])).trim();
    }

}

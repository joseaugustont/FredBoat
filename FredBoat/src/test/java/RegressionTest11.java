
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test001"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand23 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel24 = repeatCommand23.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test002"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.fun.HugCommand hugCommand28 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand29 = new fredboat.command.music.seeking.RestartCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand30 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array20);
    java.lang.String str31 = textCommand30.msg;
    java.lang.String str32 = textCommand30.msg;
    fredboat.commandmeta.abs.CommandContext commandContext33 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand30.onInvoke(commandContext33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str31.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str32.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test003"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("hi!", str_array13);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel21 = evalCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = evalCommand20.getMinimumPerms();
    java.util.List<java.lang.String> list_str23 = evalCommand20.aliases;
    fredboat.perms.PermissionLevel permissionLevel24 = evalCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test004"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("hi!", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("hi!", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test005"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("", str_array20);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ShuffleCommand shuffleCommand28 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand29 = new fredboat.command.maintenance.AudioDebugCommand("", str_array20);
    fredboat.command.music.control.RepeatCommand repeatCommand30 = new fredboat.command.music.control.RepeatCommand("", str_array20);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand31 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand32 = new fredboat.command.music.control.ReshuffleCommand("", str_array20);
    fredboat.command.music.control.DestroyCommand destroyCommand33 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand34 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand35 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array20);
    fredboat.command.admin.TestCommand testCommand36 = new fredboat.command.admin.TestCommand("", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test006"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("", str_array8);
    fredboat.command.admin.EvalCommand evalCommand13 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = brainfuckCommand14.process("http://i.imgur.com/NqyOqnj.gif", context16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test007"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("", str_array8);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand14 = new fredboat.command.fun.DanceCommand("hi!", str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test008"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = getIdCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test009"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = weatherCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test010"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test011"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand26 = new fredboat.command.music.control.LeaveCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel27 = leaveCommand26.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test012"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array18);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("", str_array18);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array18);
    fredboat.command.admin.TestCommand testCommand28 = new fredboat.command.admin.TestCommand("hi!", str_array18);
    fredboat.command.util.WeatherCommand weatherCommand29 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array18);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test013"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = randomImageCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test014"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand20 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array14);
    fredboat.command.admin.EvalCommand evalCommand22 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = facedeskCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test015"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test016"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("", str_array20);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand28 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand29 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array20);
    fredboat.command.music.control.UnpauseCommand unpauseCommand30 = new fredboat.command.music.control.UnpauseCommand("", str_array20);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand31 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.moderation.ConfigCommand configCommand32 = new fredboat.command.moderation.ConfigCommand("hi!", str_array20);
    fredboat.command.moderation.LanguageCommand languageCommand33 = new fredboat.command.moderation.LanguageCommand("hi!", str_array20);
    fredboat.command.music.control.PauseCommand pauseCommand34 = new fredboat.command.music.control.PauseCommand("hi!", str_array20);
    fredboat.command.music.control.PauseCommand pauseCommand35 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ShuffleCommand shuffleCommand36 = new fredboat.command.music.control.ShuffleCommand("", str_array20);
    fredboat.command.admin.TestCommand testCommand37 = new fredboat.command.admin.TestCommand("hi!", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test017"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("hi!", str_array11);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    textCommand17.msg = "";
    java.lang.String str20 = textCommand17.msg;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test018"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand20 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = brainfuckCommand22.process("hi!", context24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test019"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("", str_array18);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("", "", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array18);
    fredboat.command.music.control.RepeatCommand repeatCommand26 = new fredboat.command.music.control.RepeatCommand("", str_array18);
    fredboat.command.music.info.HistoryCommand historyCommand27 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.WeatherCommand weatherCommand28 = new fredboat.command.util.WeatherCommand(weather2, "", str_array18);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand29 = new fredboat.command.moderation.EnableCommandsCommand("", str_array18);
    fredboat.command.maintenance.VersionCommand versionCommand30 = new fredboat.command.maintenance.VersionCommand("", str_array18);
    fredboat.commandmeta.abs.CommandContext commandContext31 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand30.onInvoke(commandContext31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test020"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand16 = new fredboat.command.music.control.LeaveCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("", "", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand23 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel24 = enableCommandsCommand23.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test021"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = disableCommandsCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test022"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("hi!", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand13 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("hi!", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test023"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test024"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("", str_array20);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array20);
    fredboat.command.fun.HugCommand hugCommand26 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array20);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.AvatarCommand avatarCommand29 = new fredboat.command.util.AvatarCommand("hi!", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand30 = new fredboat.command.fun.RandomImageCommand("", "", str_array20);
    fredboat.command.music.control.JoinCommand joinCommand31 = new fredboat.command.music.control.JoinCommand("", str_array20);
    fredboat.command.util.CommandsCommand commandsCommand32 = new fredboat.command.util.CommandsCommand("", str_array20);
    fredboat.messaging.internal.Context context33 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = commandsCommand32.help(context33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test025"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather3, "hi!", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand22 = new fredboat.command.admin.BotRestartCommand("hi!", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("", str_array15);
    fredboat.command.music.control.PauseCommand pauseCommand24 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel25 = pauseCommand24.getMinimumPerms();
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = pauseCommand24.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test026"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("hi!", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = patCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test027"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.EvalCommand evalCommand24 = new fredboat.command.admin.EvalCommand("hi!", str_array17);
    fredboat.command.fun.CatgirlCommand catgirlCommand25 = new fredboat.command.fun.CatgirlCommand("", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.moderation.ConfigCommand configCommand27 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand28 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array17);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand29 = new fredboat.command.music.control.ReshuffleCommand("", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test028"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand24 = new fredboat.command.util.CommandsCommand("hi!", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand25 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand26 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test029"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("hi!", "", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand24 = new fredboat.command.admin.ReviveCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test030"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand9 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = restartCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = restartCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand10.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test031"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = exitCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test032"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test033"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("", "", str_array21);
    fredboat.command.music.info.HistoryCommand historyCommand27 = new fredboat.command.music.info.HistoryCommand("", str_array21);
    fredboat.command.fun.RollCommand rollCommand28 = new fredboat.command.fun.RollCommand("", "hi!", str_array21);
    fredboat.command.admin.ReviveCommand reviveCommand29 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.music.control.PauseCommand pauseCommand30 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.util.BrainfuckCommand brainfuckCommand31 = new fredboat.command.util.BrainfuckCommand("", str_array21);
    fredboat.command.fun.CatgirlCommand catgirlCommand32 = new fredboat.command.fun.CatgirlCommand("", str_array21);
    fredboat.messaging.internal.Context context33 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = catgirlCommand32.help(context33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test034"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel19 = forwardCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = forwardCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = forwardCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand18.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test035"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand18 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("hi!", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("hi!", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel23 = destroyCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test036"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array16);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array16);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("hi!", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand24 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.RollCommand rollCommand25 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand26 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test037"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test038"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("hi!", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand25 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand26 = new fredboat.command.maintenance.VersionCommand("hi!", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand27 = new fredboat.command.util.WeatherCommand(weather1, "", str_array16);
    fredboat.command.admin.ReviveCommand reviveCommand28 = new fredboat.command.admin.ReviveCommand("", str_array16);
    fredboat.perms.PermissionLevel permissionLevel29 = reviveCommand28.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand28.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test039"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand15 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.perms.PermissionLevel permissionLevel16 = reshuffleCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = reshuffleCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test040"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("hi!", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand22 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array13);
    remoteFileCommand22.url = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand22.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test041"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("hi!", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand24 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test042"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("hi!", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = testCommand17.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test043"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test044"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand22 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array16);
    fredboat.command.admin.EvalCommand evalCommand24 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.fun.HugCommand hugCommand26 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    java.io.File file27 = hugCommand26.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file27);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test045"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("", "", str_array19);
    fredboat.command.music.info.HistoryCommand historyCommand25 = new fredboat.command.music.info.HistoryCommand("", str_array19);
    fredboat.command.fun.RollCommand rollCommand26 = new fredboat.command.fun.RollCommand("", "hi!", str_array19);
    fredboat.command.admin.ReviveCommand reviveCommand27 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.PauseCommand pauseCommand28 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    java.lang.String str29 = pauseCommand28.name;
    java.util.List<java.lang.String> list_str30 = pauseCommand28.aliases;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str29.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test046"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather3, "hi!", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand22 = new fredboat.command.admin.BotRestartCommand("hi!", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test047"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand8 = new fredboat.command.moderation.DisableCommandsCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = disableCommandsCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = disableCommandsCommand8.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test048"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("", "hi!", str_array8);
    java.lang.String str13 = remoteFileCommand12.name;
    java.lang.String str14 = remoteFileCommand12.url;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test049"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand16 = new fredboat.command.music.control.LeaveCommand("", str_array14);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand22 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test050"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.perms.PermissionLevel permissionLevel23 = restartCommand22.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = restartCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand22.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test051"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.music.control.StopCommand stopCommand26 = new fredboat.command.music.control.StopCommand("", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand27 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.fun.CatgirlCommand catgirlCommand28 = new fredboat.command.fun.CatgirlCommand("", str_array21);
    fredboat.command.maintenance.GetIdCommand getIdCommand29 = new fredboat.command.maintenance.GetIdCommand("", str_array21);
    fredboat.command.music.control.LeaveCommand leaveCommand30 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.music.info.HistoryCommand historyCommand31 = new fredboat.command.music.info.HistoryCommand("hi!", str_array21);
    fredboat.command.fun.FacedeskCommand facedeskCommand32 = new fredboat.command.fun.FacedeskCommand("", "", str_array21);
    fredboat.command.admin.TestCommand testCommand33 = new fredboat.command.admin.TestCommand("hi!", str_array21);
    fredboat.commandmeta.abs.CommandContext commandContext34 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand33.onInvoke(commandContext34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test052"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand25 = new fredboat.command.fun.TextCommand("", "", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand26 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand27 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test053"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand21 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("hi!", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.fun.HugCommand hugCommand26 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.admin.EvalCommand evalCommand27 = new fredboat.command.admin.EvalCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand("", str_array16);
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = versionCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test054"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = destroyCommand16.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = destroyCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand16.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test055"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather3, "hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = configCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test056"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = setAvatarCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = setAvatarCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test057"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("hi!", str_array13);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test058"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("", str_array17);
    fredboat.command.music.seeking.RestartCommand restartCommand26 = new fredboat.command.music.seeking.RestartCommand("", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand27 = new fredboat.command.moderation.LanguageCommand("", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand28 = new fredboat.command.moderation.LanguageCommand("hi!", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand29 = new fredboat.command.admin.NodeAdminCommand("", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test059"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel21 = updateCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = updateCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test060"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("", str_array5);
    fredboat.command.admin.ReviveCommand reviveCommand8 = new fredboat.command.admin.ReviveCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = reviveCommand8.getMinimumPerms();
    java.lang.String str10 = reviveCommand8.name;
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = reviveCommand8.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test061"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("", "", str_array20);
    fredboat.command.music.info.HistoryCommand historyCommand26 = new fredboat.command.music.info.HistoryCommand("", str_array20);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("", "hi!", str_array20);
    fredboat.command.admin.ReviveCommand reviveCommand28 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.admin.ExitCommand exitCommand29 = new fredboat.command.admin.ExitCommand("", str_array20);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand30 = new fredboat.command.moderation.EnableCommandsCommand("", str_array20);
    fredboat.perms.PermissionLevel permissionLevel31 = enableCommandsCommand30.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand30.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test062"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("hi!", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand25 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand26 = new fredboat.command.maintenance.NodesCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = nodesCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test063"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test064"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = stopCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test065"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    java.lang.String str7 = setAvatarCommand6.name;
    fredboat.perms.PermissionLevel permissionLevel8 = setAvatarCommand6.getMinimumPerms();
    java.util.List<java.lang.String> list_str9 = setAvatarCommand6.aliases;
    fredboat.perms.PermissionLevel permissionLevel10 = setAvatarCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = setAvatarCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = setAvatarCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = setAvatarCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand6.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test066"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.ShuffleCommand shuffleCommand24 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.RepeatCommand repeatCommand25 = new fredboat.command.music.control.RepeatCommand("", str_array19);
    fredboat.command.util.MathCommand mathCommand26 = new fredboat.command.util.MathCommand("", str_array19);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("", str_array19);
    fredboat.command.moderation.ConfigCommand configCommand28 = new fredboat.command.moderation.ConfigCommand("", str_array19);
    fredboat.command.fun.HugCommand hugCommand29 = new fredboat.command.fun.HugCommand("hi!", "", str_array19);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand30 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array19);
    fredboat.command.music.seeking.ForwardCommand forwardCommand31 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array19);
    fredboat.command.fun.FacedeskCommand facedeskCommand32 = new fredboat.command.fun.FacedeskCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.RepeatCommand repeatCommand33 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test067"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand27 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.LeaveCommand leaveCommand28 = new fredboat.command.music.control.LeaveCommand("", str_array17);
    fredboat.command.util.WeatherCommand weatherCommand29 = new fredboat.command.util.WeatherCommand(weather0, "", str_array17);
    fredboat.messaging.internal.Context context30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = weatherCommand29.help(context30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test068"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel16 = reviveCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = reviveCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = reviveCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = reviveCommand15.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test069"); }

    fredboat.util.rest.Weather weather0 = null;
    fredboat.util.rest.Weather weather4 = null;
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather4, "", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.WeatherCommand weatherCommand16 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array10);
    java.lang.String str17 = weatherCommand16.name;
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = weatherCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test070"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("hi!", str_array14);
    fredboat.command.admin.EvalCommand evalCommand22 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand23 = new fredboat.command.music.control.PlaySplitCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test071"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand13 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand14 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("hi!", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test072"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test073"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("", "", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = facedeskCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test074"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = exitCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test075"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand23 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("", str_array18);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand26 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test076"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand("", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand26 = new fredboat.command.maintenance.VersionCommand("hi!", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand27 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array16);
    fredboat.perms.PermissionLevel permissionLevel28 = rewindCommand27.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test077"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.seeking.RewindCommand rewindCommand27 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand28 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    textCommand28.msg = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test078"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("hi!", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test079"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array10);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test080"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand23 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand25 = new fredboat.command.maintenance.GitInfoCommand("", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand26 = new fredboat.command.music.seeking.RewindCommand("", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand27 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test081"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand24 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand26 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test082"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather2, "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = unpauseCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = unpauseCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test083"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test084"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test085"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand14 = new fredboat.command.music.control.ReshuffleCommand("", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test086"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("hi!", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("hi!", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand27 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand28 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand29 = new fredboat.command.maintenance.NodesCommand("hi!", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand30 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test087"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand15 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = enableCommandsCommand17.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test088"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = seekCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test089"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("hi!", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand26 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand27 = new fredboat.command.moderation.LanguageCommand("hi!", str_array18);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test090"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand17 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("", str_array14);
    fredboat.command.music.info.ListCommand listCommand24 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand25 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test091"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand24 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand25 = new fredboat.command.moderation.ConfigCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test092"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand17 = new fredboat.command.fun.RemoteFileCommand("", "hi!", str_array11);
    java.lang.String str18 = remoteFileCommand17.url;
    remoteFileCommand17.url = "";
    remoteFileCommand17.url = "";
    remoteFileCommand17.url = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test093"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("", "", str_array17);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand24 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("", str_array17);
    fredboat.command.util.WeatherCommand weatherCommand26 = new fredboat.command.util.WeatherCommand(weather0, "", str_array17);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = weatherCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test094"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand21 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test095"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = audioDebugCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test096"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test097"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("", "", str_array20);
    fredboat.command.music.info.HistoryCommand historyCommand26 = new fredboat.command.music.info.HistoryCommand("", str_array20);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("", "hi!", str_array20);
    fredboat.command.music.control.RepeatCommand repeatCommand28 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.fun.TextCommand textCommand29 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test098"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.info.HistoryCommand historyCommand25 = new fredboat.command.music.info.HistoryCommand("", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array19);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array19);
    fredboat.command.admin.BotRestartCommand botRestartCommand28 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test099"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("hi!", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test100"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("hi!", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("hi!", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand27 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel28 = joinCommand27.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel29 = joinCommand27.getMinimumPerms();
    fredboat.messaging.internal.Context context30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = joinCommand27.help(context30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test101"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.command.util.MathCommand mathCommand22 = new fredboat.command.util.MathCommand("", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand25 = new fredboat.command.util.CommandsCommand("", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand26 = new fredboat.command.moderation.EnableCommandsCommand("", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test102"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand24 = new fredboat.command.music.control.ReshuffleCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test103"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand23 = new fredboat.command.music.control.UnpauseCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel24 = unpauseCommand23.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel25 = unpauseCommand23.getMinimumPerms();
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = unpauseCommand23.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test104"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("hi!", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = stopCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test105"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand23 = new fredboat.command.music.control.PlaySplitCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("", str_array15);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("hi!", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand26 = new fredboat.command.admin.UpdateCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel27 = updateCommand26.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test106"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("", str_array19);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand28 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array19);
    fredboat.command.music.control.UnpauseCommand unpauseCommand29 = new fredboat.command.music.control.UnpauseCommand("", str_array19);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand30 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.moderation.ConfigCommand configCommand31 = new fredboat.command.moderation.ConfigCommand("hi!", str_array19);
    fredboat.command.moderation.LanguageCommand languageCommand32 = new fredboat.command.moderation.LanguageCommand("hi!", str_array19);
    fredboat.command.music.control.PauseCommand pauseCommand33 = new fredboat.command.music.control.PauseCommand("hi!", str_array19);
    fredboat.command.music.control.PauseCommand pauseCommand34 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.util.ServerInfoCommand serverInfoCommand35 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    java.util.List<java.lang.String> list_str36 = serverInfoCommand35.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext37 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand35.onInvoke(commandContext37);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str36);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test107"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand21 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = testCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test108"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array12);
    java.util.List<java.lang.String> list_str19 = hugCommand18.aliases;
    java.io.File file20 = hugCommand18.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand18.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file20);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test109"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("", str_array17);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("hi!", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array17);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("", "", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("", "hi!", str_array17);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand28 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand29 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array17);
    fredboat.perms.PermissionLevel permissionLevel30 = disableCommandsCommand29.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test110"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = avatarCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test111"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("hi!", str_array15);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand23 = new fredboat.command.maintenance.VersionCommand("", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand24 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand25 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test112"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.perms.PermissionLevel permissionLevel16 = reviveCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = reviveCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = reviveCommand15.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test113"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand21 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand24 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand26 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel27 = repeatCommand26.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel28 = repeatCommand26.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test114"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand25 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand26 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test115"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("hi!", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand18 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = leaveCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = leaveCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test116"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("hi!", str_array13);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.TestCommand testCommand21 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = unblacklistCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test117"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand27 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand28 = new fredboat.command.music.control.UnpauseCommand("", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand29 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand30 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.JoinCommand joinCommand31 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.BotRestartCommand botRestartCommand32 = new fredboat.command.admin.BotRestartCommand("", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand33 = new fredboat.command.music.seeking.RestartCommand("", str_array18);
    fredboat.perms.PermissionLevel permissionLevel34 = restartCommand33.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext35 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand33.onInvoke(commandContext35);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    org.junit.Assert.assertTrue("'" + permissionLevel34 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel34.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test118"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("hi!", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand25 = new fredboat.command.util.ServerInfoCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand26 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand27 = new fredboat.command.util.AvatarCommand("hi!", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand28 = new fredboat.command.music.control.DestroyCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel29 = destroyCommand28.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel30 = destroyCommand28.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test119"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "", str_array10);
    java.lang.String str17 = textCommand16.msg;
    textCommand16.msg = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand16.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test120"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.WeatherCommand weatherCommand16 = new fredboat.command.util.WeatherCommand(weather0, "", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test121"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = gitInfoCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test122"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = unpauseCommand14.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test123"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.ReviveCommand reviveCommand20 = new fredboat.command.admin.ReviveCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test124"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = rewindCommand17.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = rewindCommand17.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = rewindCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = rewindCommand17.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test125"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = enableCommandsCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test126"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand21 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand25 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand26 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand27 = new fredboat.command.fun.CatgirlCommand("", str_array15);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = catgirlCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test127"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand13 = new fredboat.command.music.control.PauseCommand("hi!", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test128"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "", str_array19);
    fredboat.command.admin.UpdateCommand updateCommand24 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.NodesCommand nodesCommand25 = new fredboat.command.maintenance.NodesCommand("", str_array19);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.JoinCommand joinCommand27 = new fredboat.command.music.control.JoinCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand28 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.music.seeking.RewindCommand rewindCommand29 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array19);
    fredboat.command.fun.TextCommand textCommand30 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.DestroyCommand destroyCommand31 = new fredboat.command.music.control.DestroyCommand("hi!", str_array19);
    fredboat.command.maintenance.NodesCommand nodesCommand32 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test129"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array13);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand23 = new fredboat.command.maintenance.GitInfoCommand("", str_array13);
    fredboat.command.util.MathCommand mathCommand24 = new fredboat.command.util.MathCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test130"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand21 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.admin.EvalCommand evalCommand22 = new fredboat.command.admin.EvalCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand23 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test131"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = updateCommand17.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = updateCommand17.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test132"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("hi!", str_array15);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand23 = new fredboat.command.maintenance.VersionCommand("", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand24 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test133"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("hi!", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test134"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = commandsCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test135"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.ExitCommand exitCommand2 = new fredboat.command.admin.ExitCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test136"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test137"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand26 = new fredboat.command.maintenance.GitInfoCommand("", str_array17);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand27 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand("hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand29 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.messaging.internal.Context context30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = serverInfoCommand29.help(context30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test138"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array21);
    fredboat.command.music.info.ListCommand listCommand23 = new fredboat.command.music.info.ListCommand("", str_array21);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array21);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand26 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand27 = new fredboat.command.maintenance.PingCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand28 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.music.control.StopCommand stopCommand29 = new fredboat.command.music.control.StopCommand("hi!", str_array21);
    fredboat.command.admin.BotRestartCommand botRestartCommand30 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.fun.RollCommand rollCommand31 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand32 = new fredboat.command.maintenance.AudioDebugCommand("", str_array21);
    fredboat.command.fun.FacedeskCommand facedeskCommand33 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array21);
    fredboat.command.fun.FacedeskCommand facedeskCommand34 = new fredboat.command.fun.FacedeskCommand("", "", str_array21);
    fredboat.command.util.AvatarCommand avatarCommand35 = new fredboat.command.util.AvatarCommand("hi!", str_array21);
    fredboat.command.admin.ExitCommand exitCommand36 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test139"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand("hi!", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test140"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("", "", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("hi!", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test141"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array13);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.seeking.RewindCommand rewindCommand21 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand23 = new fredboat.command.maintenance.VersionCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand24 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test142"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.music.control.LeaveCommand leaveCommand25 = new fredboat.command.music.control.LeaveCommand("", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.ReviveCommand reviveCommand27 = new fredboat.command.admin.ReviveCommand("hi!", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand28 = new fredboat.command.admin.UpdateCommand("", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test143"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = exitCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = exitCommand11.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test144"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = brainfuckCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test145"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand25 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand26 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.util.CommandsCommand commandsCommand27 = new fredboat.command.util.CommandsCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand28 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    java.lang.String str29 = textCommand28.msg;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str29.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test146"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather2, "hi!", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand21 = new fredboat.command.admin.BotRestartCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test147"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test148"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand24 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand25 = new fredboat.command.admin.TestCommand("hi!", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test149"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = repeatCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = repeatCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test150"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    java.lang.String str20 = textCommand19.msg;
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str20.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test151"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand22 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = enableCommandsCommand22.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = enableCommandsCommand22.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel25 = enableCommandsCommand22.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel26 = enableCommandsCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand22.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test152"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand18 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test153"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = unblacklistCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test154"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand24 = new fredboat.command.admin.BotRestartCommand("hi!", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand25 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = setAvatarCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test155"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("", str_array17);
    fredboat.command.admin.TestCommand testCommand21 = new fredboat.command.admin.TestCommand("", str_array17);
    fredboat.command.admin.EvalCommand evalCommand22 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand24 = new fredboat.command.admin.UnblacklistCommand("", str_array17);
    fredboat.command.admin.TestCommand testCommand25 = new fredboat.command.admin.TestCommand("", str_array17);
    fredboat.command.moderation.ConfigCommand configCommand26 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.TextCommand textCommand27 = new fredboat.command.fun.TextCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.HugCommand hugCommand28 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.TestCommand testCommand29 = new fredboat.command.admin.TestCommand("hi!", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test156"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test157"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.fun.HugCommand hugCommand28 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand29 = new fredboat.command.music.seeking.RestartCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand30 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array20);
    java.lang.String str31 = textCommand30.msg;
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand30.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str31.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test158"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    remoteFileCommand9.url = "http://i.imgur.com/NqyOqnj.gif";
    remoteFileCommand9.url = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test159"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("", str_array6);
    fredboat.command.music.seeking.RewindCommand rewindCommand10 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test160"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array16);
    fredboat.command.admin.TestCommand testCommand21 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("hi!", str_array16);
    fredboat.command.fun.HugCommand hugCommand24 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.EvalCommand evalCommand25 = new fredboat.command.admin.EvalCommand("", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand26 = new fredboat.command.moderation.ConfigCommand("hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test161"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand24 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand25 = new fredboat.command.moderation.ConfigCommand("", str_array14);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = configCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test162"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array18);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand25 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array18);
    fredboat.command.maintenance.VersionCommand versionCommand26 = new fredboat.command.maintenance.VersionCommand("hi!", str_array18);
    fredboat.command.fun.FacedeskCommand facedeskCommand27 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand28 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.command.maintenance.VersionCommand versionCommand29 = new fredboat.command.maintenance.VersionCommand("", str_array18);
    fredboat.command.music.control.JoinCommand joinCommand30 = new fredboat.command.music.control.JoinCommand("hi!", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand31 = new fredboat.command.util.BrainfuckCommand("hi!", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test163"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array19);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.fun.CatgirlCommand catgirlCommand26 = new fredboat.command.fun.CatgirlCommand("", str_array19);
    fredboat.command.maintenance.GetIdCommand getIdCommand27 = new fredboat.command.maintenance.GetIdCommand("", str_array19);
    fredboat.command.music.control.LeaveCommand leaveCommand28 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.info.HistoryCommand historyCommand29 = new fredboat.command.music.info.HistoryCommand("hi!", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand30 = new fredboat.command.music.seeking.SeekCommand("", str_array19);
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = seekCommand30.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test164"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.seeking.RewindCommand rewindCommand27 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand28 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = remoteFileCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test165"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("hi!", str_array13);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel21 = evalCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = evalCommand20.getMinimumPerms();
    java.util.List<java.lang.String> list_str23 = evalCommand20.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand20.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test166"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand22 = new fredboat.command.fun.RemoteFileCommand("", "", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test167"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = unblacklistCommand17.getMinimumPerms();
    java.lang.String str19 = unblacklistCommand17.name;
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = unblacklistCommand17.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test168"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand22 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand23 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test169"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test170"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.EvalCommand evalCommand24 = new fredboat.command.admin.EvalCommand("hi!", str_array17);
    fredboat.command.fun.CatgirlCommand catgirlCommand25 = new fredboat.command.fun.CatgirlCommand("", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.moderation.ConfigCommand configCommand27 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test171"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array22 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array22);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array22);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array22);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("", str_array22);
    fredboat.command.fun.RandomImageCommand randomImageCommand27 = new fredboat.command.fun.RandomImageCommand("", "", str_array22);
    fredboat.command.music.info.HistoryCommand historyCommand28 = new fredboat.command.music.info.HistoryCommand("", str_array22);
    fredboat.command.fun.RollCommand rollCommand29 = new fredboat.command.fun.RollCommand("", "hi!", str_array22);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand30 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array22);
    fredboat.command.music.info.ListCommand listCommand31 = new fredboat.command.music.info.ListCommand("", str_array22);
    fredboat.command.util.WeatherCommand weatherCommand32 = new fredboat.command.util.WeatherCommand(weather1, "hi!", str_array22);
    fredboat.command.moderation.ConfigCommand configCommand33 = new fredboat.command.moderation.ConfigCommand("", str_array22);
    fredboat.messaging.internal.Context context34 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str35 = configCommand33.help(context34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test172"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand25 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array16);
    fredboat.command.admin.ExitCommand exitCommand26 = new fredboat.command.admin.ExitCommand("hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test173"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.command.util.MathCommand mathCommand18 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand21 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("hi!", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test174"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test175"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("", str_array12);
    fredboat.command.admin.BotRestartCommand botRestartCommand18 = new fredboat.command.admin.BotRestartCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = exitCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test176"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "", str_array19);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand25 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array19);
    fredboat.command.admin.ReviveCommand reviveCommand26 = new fredboat.command.admin.ReviveCommand("", str_array19);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand27 = new fredboat.command.maintenance.AudioDebugCommand("", str_array19);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    java.io.File file29 = facedeskCommand28.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand28.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file29);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test177"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = enableCommandsCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = enableCommandsCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = enableCommandsCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = enableCommandsCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = enableCommandsCommand13.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test178"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand24 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand25 = new fredboat.command.music.control.RepeatCommand("", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand26 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.PauseCommand pauseCommand27 = new fredboat.command.music.control.PauseCommand("hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand28 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test179"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand("", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand26 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("", str_array16);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = reshuffleCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test180"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand23 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel24 = leaveCommand23.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel25 = leaveCommand23.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test181"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("", str_array14);
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("hi!", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand23 = new fredboat.command.music.info.ListCommand("hi!", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand24 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test182"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand25 = new fredboat.command.music.control.PlaySplitCommand("", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand26 = new fredboat.command.maintenance.AudioDebugCommand("", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand27 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand28 = new fredboat.command.music.control.JoinCommand("hi!", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand29 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test183"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand24 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand26 = new fredboat.command.admin.TestCommand("", str_array16);
    fredboat.command.admin.ReviveCommand reviveCommand27 = new fredboat.command.admin.ReviveCommand("hi!", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand28 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.perms.PermissionLevel permissionLevel29 = setAvatarCommand28.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test184"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = unpauseCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test185"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("", str_array17);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand24 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand26 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("", str_array17);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand28 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand29 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand30 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.ReviveCommand reviveCommand31 = new fredboat.command.admin.ReviveCommand("", str_array17);
    java.lang.String str32 = reviveCommand31.name;
    fredboat.messaging.internal.Context context33 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = reviveCommand31.help(context33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test186"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand26 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand27 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand28 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = catgirlCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test187"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand25 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand27 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test188"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = serverInfoCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test189"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel18 = repeatCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = repeatCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test190"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.fun.RollCommand rollCommand25 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand26 = new fredboat.command.fun.FacedeskCommand("hi!", "", str_array17);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = facedeskCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test191"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = evalCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = evalCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test192"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand22 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test193"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand22 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    remoteFileCommand22.url = "http://i.imgur.com/NqyOqnj.gif";
    java.lang.String str25 = remoteFileCommand22.url;
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand22.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str25.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test194"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("", str_array8);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = updateCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = updateCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test195"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand27 = new fredboat.command.maintenance.VersionCommand("", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand28 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.admin.EvalCommand evalCommand29 = new fredboat.command.admin.EvalCommand("hi!", str_array17);
    fredboat.perms.PermissionLevel permissionLevel30 = evalCommand29.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test196"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("hi!", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test197"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("hi!", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("hi!", "", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test198"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("hi!", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand22 = new fredboat.command.admin.ReviveCommand("hi!", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test199"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = forwardCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test200"); }

    java.lang.String[] str_array23 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand24 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array23);
    fredboat.command.music.info.ListCommand listCommand25 = new fredboat.command.music.info.ListCommand("", str_array23);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array23);
    fredboat.command.music.control.StopCommand stopCommand27 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array23);
    fredboat.command.music.control.ShuffleCommand shuffleCommand28 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array23);
    fredboat.command.music.control.RepeatCommand repeatCommand29 = new fredboat.command.music.control.RepeatCommand("", str_array23);
    fredboat.command.util.MathCommand mathCommand30 = new fredboat.command.util.MathCommand("", str_array23);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand31 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array23);
    fredboat.command.music.info.HistoryCommand historyCommand32 = new fredboat.command.music.info.HistoryCommand("hi!", str_array23);
    fredboat.command.fun.HugCommand hugCommand33 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array23);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand34 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array23);
    fredboat.command.fun.HugCommand hugCommand35 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array23);
    fredboat.command.admin.ReviveCommand reviveCommand36 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array23);
    fredboat.command.util.BrainfuckCommand brainfuckCommand37 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array23);
    fredboat.command.maintenance.PingCommand pingCommand38 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array23);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand39 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array23);
    fredboat.command.music.control.DestroyCommand destroyCommand40 = new fredboat.command.music.control.DestroyCommand("hi!", str_array23);
    fredboat.command.maintenance.PingCommand pingCommand41 = new fredboat.command.maintenance.PingCommand("", str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test201"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("hi!", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test202"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test203"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("", "", str_array20);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array20);
    fredboat.command.maintenance.GetIdCommand getIdCommand24 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array20);
    fredboat.command.music.control.PauseCommand pauseCommand25 = new fredboat.command.music.control.PauseCommand("", str_array20);
    fredboat.command.moderation.ConfigCommand configCommand26 = new fredboat.command.moderation.ConfigCommand("hi!", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array20);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand28 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array20);
    fredboat.command.music.control.UnpauseCommand unpauseCommand29 = new fredboat.command.music.control.UnpauseCommand("", str_array20);
    fredboat.command.music.control.LeaveCommand leaveCommand30 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand31 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand32 = new fredboat.command.util.BrainfuckCommand("", str_array20);
    fredboat.command.music.control.RepeatCommand repeatCommand33 = new fredboat.command.music.control.RepeatCommand("", str_array20);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand34 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array20);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand35 = new fredboat.command.fun.DanceCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test204"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = reshuffleCommand19.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test205"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("hi!", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array12);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand20 = new fredboat.command.fun.DanceCommand("hi!", str_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test206"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand10 = new fredboat.command.maintenance.NodesCommand("hi!", str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test207"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand22 = new fredboat.command.admin.ReviveCommand("", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = catgirlCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test208"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = brainfuckCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test209"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = evalCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test210"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = unblacklistCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = unblacklistCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test211"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("", "", str_array19);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("", str_array19);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array19);
    fredboat.command.music.control.PauseCommand pauseCommand24 = new fredboat.command.music.control.PauseCommand("", str_array19);
    fredboat.command.moderation.ConfigCommand configCommand25 = new fredboat.command.moderation.ConfigCommand("hi!", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array19);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand27 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array19);
    fredboat.command.music.control.UnpauseCommand unpauseCommand28 = new fredboat.command.music.control.UnpauseCommand("", str_array19);
    fredboat.command.music.control.LeaveCommand leaveCommand29 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand30 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array19);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand31 = new fredboat.command.fun.RemoteFileCommand("", "", str_array19);
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand31.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test212"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("hi!", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("", str_array16);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("", "", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand25 = new fredboat.command.fun.TextCommand("", "hi!", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand26 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array16);
    fredboat.command.admin.ExitCommand exitCommand27 = new fredboat.command.admin.ExitCommand("", str_array16);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = exitCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test213"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand22 = new fredboat.command.moderation.EnableCommandsCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand24 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand25 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = getIdCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test214"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("", "", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("hi!", str_array17);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test215"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = rewindCommand17.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test216"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test217"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.util.ServerInfoCommand serverInfoCommand22 = new fredboat.command.util.ServerInfoCommand("", str_array20);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("", str_array20);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand24 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array20);
    fredboat.command.maintenance.GetIdCommand getIdCommand26 = new fredboat.command.maintenance.GetIdCommand("", str_array20);
    fredboat.command.admin.ExitCommand exitCommand27 = new fredboat.command.admin.ExitCommand("hi!", str_array20);
    fredboat.command.music.seeking.ForwardCommand forwardCommand28 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array20);
    fredboat.command.util.CommandsCommand commandsCommand29 = new fredboat.command.util.CommandsCommand("", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand30 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand31 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand32 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.ServerInfoCommand serverInfoCommand33 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.admin.UpdateCommand updateCommand34 = new fredboat.command.admin.UpdateCommand("hi!", str_array20);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand35 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array20);
    fredboat.command.music.control.LeaveCommand leaveCommand36 = new fredboat.command.music.control.LeaveCommand("hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand37 = new fredboat.command.music.control.StopCommand("hi!", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test218"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("hi!", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand25 = new fredboat.command.util.CommandsCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = commandsCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test219"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("", "", str_array20);
    fredboat.command.music.info.HistoryCommand historyCommand26 = new fredboat.command.music.info.HistoryCommand("", str_array20);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("", "hi!", str_array20);
    fredboat.command.admin.ReviveCommand reviveCommand28 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.PauseCommand pauseCommand29 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand30 = new fredboat.command.util.BrainfuckCommand("", str_array20);
    fredboat.messaging.internal.Context context32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = brainfuckCommand30.process("http://i.imgur.com/NqyOqnj.gif", context32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test220"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = pingCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test221"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand23 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel24 = repeatCommand23.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel25 = repeatCommand23.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test222"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("", "", str_array21);
    fredboat.command.music.info.HistoryCommand historyCommand27 = new fredboat.command.music.info.HistoryCommand("", str_array21);
    fredboat.command.fun.RollCommand rollCommand28 = new fredboat.command.fun.RollCommand("", "hi!", str_array21);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand29 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array21);
    fredboat.command.music.info.ListCommand listCommand30 = new fredboat.command.music.info.ListCommand("", str_array21);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand31 = new fredboat.command.music.control.ReshuffleCommand("", str_array21);
    fredboat.command.maintenance.NodesCommand nodesCommand32 = new fredboat.command.maintenance.NodesCommand("hi!", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test223"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test224"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand14 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test225"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.SeekCommand seekCommand9 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.RewindCommand rewindCommand10 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array6);
    java.lang.String str11 = rewindCommand10.name;
    fredboat.perms.PermissionLevel permissionLevel12 = rewindCommand10.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test226"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test227"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand11 = new fredboat.command.music.control.PauseCommand("hi!", str_array7);
    fredboat.command.moderation.ConfigCommand configCommand12 = new fredboat.command.moderation.ConfigCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = configCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = configCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test228"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test229"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand24 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test230"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("hi!", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = historyCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test231"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand23 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("", str_array18);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand26 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.perms.PermissionLevel permissionLevel28 = unpauseCommand27.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel29 = unpauseCommand27.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel30 = unpauseCommand27.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel31 = unpauseCommand27.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test232"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("hi!", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand24 = new fredboat.command.admin.UpdateCommand("hi!", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand25 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand26 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand27 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test233"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("", str_array17);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("hi!", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array17);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("", "", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("", "hi!", str_array17);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand28 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand29 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test234"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("", str_array19);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("", str_array19);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand23 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array19);
    fredboat.command.fun.HugCommand hugCommand25 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array19);
    fredboat.command.music.control.UnpauseCommand unpauseCommand26 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand28 = new fredboat.command.admin.UnblacklistCommand("", str_array19);
    fredboat.command.music.control.PauseCommand pauseCommand29 = new fredboat.command.music.control.PauseCommand("hi!", str_array19);
    fredboat.command.music.control.JoinCommand joinCommand30 = new fredboat.command.music.control.JoinCommand("hi!", str_array19);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand31 = new fredboat.command.maintenance.AudioDebugCommand("", str_array19);
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand31.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test235"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand9 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.admin.ReviveCommand reviveCommand11 = new fredboat.command.admin.ReviveCommand("hi!", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand12 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test236"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand24 = new fredboat.command.maintenance.GitInfoCommand("", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel26 = joinCommand25.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test237"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("", "", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("hi!", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand25 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand26 = new fredboat.command.admin.UpdateCommand("hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test238"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand18 = new fredboat.command.music.control.LeaveCommand("", str_array16);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("", "hi!", str_array16);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test239"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test240"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand17 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand18 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array12);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.perms.PermissionLevel permissionLevel21 = evalCommand20.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand20.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test241"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand22 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("", str_array14);
    fredboat.command.fun.HugCommand hugCommand24 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand25 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test242"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = repeatCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test243"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand17 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand23 = new fredboat.command.util.WeatherCommand(weather0, "", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = weatherCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test244"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand20 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test245"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand27 = new fredboat.command.maintenance.VersionCommand("hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand28 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test246"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand12 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test247"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = joinCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = joinCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = joinCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel25 = joinCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test248"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = forwardCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test249"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("", "", str_array14);
    java.lang.String str25 = textCommand24.msg;
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = textCommand24.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test250"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = seekCommand19.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test251"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = patCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test252"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel21 = seekCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = seekCommand20.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = seekCommand20.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test253"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand23 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.music.control.StopCommand stopCommand26 = new fredboat.command.music.control.StopCommand("hi!", str_array18);
    fredboat.command.admin.BotRestartCommand botRestartCommand27 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.RollCommand rollCommand28 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand29 = new fredboat.command.maintenance.AudioDebugCommand("", str_array18);
    fredboat.command.fun.FacedeskCommand facedeskCommand30 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array18);
    fredboat.command.util.CommandsCommand commandsCommand31 = new fredboat.command.util.CommandsCommand("", str_array18);
    fredboat.messaging.internal.Context context32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = commandsCommand31.help(context32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test254"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("hi!", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("", "", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel21 = forwardCommand20.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = forwardCommand20.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test255"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test256"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand20 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("hi!", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand22 = new fredboat.command.fun.CatgirlCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = catgirlCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test257"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand23 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test258"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand24 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel27 = reshuffleCommand26.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand26.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test259"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = forwardCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = forwardCommand19.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test260"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand18 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test261"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.perms.PermissionLevel permissionLevel21 = nodeAdminCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = nodeAdminCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = nodeAdminCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = nodeAdminCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test262"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test263"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test264"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = serverInfoCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test265"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = rewindCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = rewindCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test266"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand9 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = enableCommandsCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test267"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("", "", str_array8);
    remoteFileCommand13.url = "";
    remoteFileCommand13.url = "http://i.imgur.com/NqyOqnj.gif";
    java.lang.String str18 = remoteFileCommand13.url;
    remoteFileCommand13.url = "hi!";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str18.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test268"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel21 = shuffleCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test269"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("hi!", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand26 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand27 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand("", str_array17);
    fredboat.command.music.control.LeaveCommand leaveCommand29 = new fredboat.command.music.control.LeaveCommand("", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test270"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("", str_array20);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand28 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand29 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array20);
    fredboat.command.music.control.UnpauseCommand unpauseCommand30 = new fredboat.command.music.control.UnpauseCommand("", str_array20);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand31 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.moderation.ConfigCommand configCommand32 = new fredboat.command.moderation.ConfigCommand("hi!", str_array20);
    fredboat.command.moderation.LanguageCommand languageCommand33 = new fredboat.command.moderation.LanguageCommand("hi!", str_array20);
    fredboat.command.music.control.PauseCommand pauseCommand34 = new fredboat.command.music.control.PauseCommand("hi!", str_array20);
    fredboat.command.music.control.PauseCommand pauseCommand35 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.ServerInfoCommand serverInfoCommand36 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.PauseCommand pauseCommand37 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test271"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel19 = shuffleCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = shuffleCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand18.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test272"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "", str_array19);
    fredboat.command.admin.UpdateCommand updateCommand24 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.NodesCommand nodesCommand25 = new fredboat.command.maintenance.NodesCommand("", str_array19);
    fredboat.command.fun.FacedeskCommand facedeskCommand26 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand27 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand28 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array19);
    fredboat.command.admin.TestCommand testCommand29 = new fredboat.command.admin.TestCommand("hi!", str_array19);
    fredboat.command.util.WeatherCommand weatherCommand30 = new fredboat.command.util.WeatherCommand(weather1, "hi!", str_array19);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand31 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array19);
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand31.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test273"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = repeatCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = repeatCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand15.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test274"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("", str_array16);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("hi!", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand24 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand25 = new fredboat.command.admin.UpdateCommand("hi!", str_array16);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand26 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand27 = new fredboat.command.util.WeatherCommand(weather2, "hi!", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand28 = new fredboat.command.music.control.LeaveCommand("hi!", str_array16);
    fredboat.command.util.MathCommand mathCommand29 = new fredboat.command.util.MathCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test275"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand20 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand23 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test276"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = unpauseCommand16.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test277"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand15 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = randomImageCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test278"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    java.lang.String str17 = facedeskCommand16.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str17.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test279"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = unblacklistCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test280"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand23 = new fredboat.command.music.control.DestroyCommand("hi!", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("hi!", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("hi!", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand27 = new fredboat.command.maintenance.VersionCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand28 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand29 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand30 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array17);
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = remoteFileCommand30.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test281"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("", "", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test282"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.admin.EvalCommand evalCommand21 = new fredboat.command.admin.EvalCommand("", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = evalCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test283"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("hi!", str_array12);
    fredboat.command.admin.BotRestartCommand botRestartCommand17 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = playSplitCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test284"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("", str_array19);
    fredboat.command.fun.RollCommand rollCommand26 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand27 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array19);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test285"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = destroyCommand14.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test286"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test287"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test288"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand23 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand25 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand26 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand27 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand28 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    java.io.File file29 = randomImageCommand28.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file29);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test289"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = unblacklistCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test290"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test291"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand13 = new fredboat.command.music.control.PauseCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = forwardCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = forwardCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand14.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test292"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = destroyCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test293"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand22 = new fredboat.command.admin.BotRestartCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = botRestartCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test294"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("hi!", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand10 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand12 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test295"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("hi!", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand21 = new fredboat.command.maintenance.VersionCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("", str_array14);
    fredboat.command.fun.HugCommand hugCommand23 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    textCommand24.msg = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand24.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test296"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test297"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("", str_array15);
    fredboat.command.util.MathCommand mathCommand23 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand24 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    java.io.File file25 = facedeskCommand24.getRandomFile();
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = facedeskCommand24.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file25);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test298"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand24 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("", str_array16);
    fredboat.command.music.control.RepeatCommand repeatCommand26 = new fredboat.command.music.control.RepeatCommand("", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand27 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand28 = new fredboat.command.music.control.ReshuffleCommand("", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand29 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.perms.PermissionLevel permissionLevel30 = destroyCommand29.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel31 = destroyCommand29.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand29.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test299"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test300"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("hi!", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand25 = new fredboat.command.admin.UnblacklistCommand("", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand26 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand27 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test301"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("hi!", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand20 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test302"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand21 = new fredboat.command.music.seeking.RewindCommand("", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("", str_array12);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = repeatCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test303"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand18 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test304"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("", "", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test305"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand23 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("", str_array18);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand26 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.perms.PermissionLevel permissionLevel28 = unpauseCommand27.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel29 = unpauseCommand27.getMinimumPerms();
    fredboat.messaging.internal.Context context30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = unpauseCommand27.help(context30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test306"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand23 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test307"); }

    fredboat.util.rest.Weather weather6 = null;
    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("", str_array17);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.util.WeatherCommand weatherCommand23 = new fredboat.command.util.WeatherCommand(weather6, "hi!", str_array17);
    fredboat.command.admin.ReviveCommand reviveCommand24 = new fredboat.command.admin.ReviveCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand25 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand26 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.TextCommand textCommand27 = new fredboat.command.fun.TextCommand("", "", str_array17);
    textCommand27.msg = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test308"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "", str_array17);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand23 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array17);
    fredboat.command.admin.ReviveCommand reviveCommand24 = new fredboat.command.admin.ReviveCommand("", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("", str_array17);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = audioDebugCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test309"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel25 = stopCommand24.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test310"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand("", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand26 = new fredboat.command.maintenance.VersionCommand("", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand27 = new fredboat.command.music.control.LeaveCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test311"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    java.lang.String str15 = audioDebugCommand14.name;
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str15.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test312"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("", "hi!", str_array14);
    java.io.File file23 = randomImageCommand22.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file23);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test313"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test314"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.util.MathCommand mathCommand27 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.PatCommand patCommand28 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test315"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand18 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand21 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test316"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array18);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("", str_array18);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array18);
    fredboat.command.admin.TestCommand testCommand28 = new fredboat.command.admin.TestCommand("hi!", str_array18);
    fredboat.command.maintenance.VersionCommand versionCommand29 = new fredboat.command.maintenance.VersionCommand("", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand30 = new fredboat.command.maintenance.NodesCommand("hi!", str_array18);
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = nodesCommand30.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test317"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("hi!", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = audioDebugCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test318"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand23 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("", str_array18);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand26 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = unpauseCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test319"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test320"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test321"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather3, "hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test322"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand24 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand26 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test323"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.CommandsCommand commandsCommand26 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.TestCommand testCommand27 = new fredboat.command.admin.TestCommand("", str_array16);
    fredboat.command.util.MathCommand mathCommand28 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand29 = new fredboat.command.maintenance.VersionCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test324"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand15 = new fredboat.command.fun.CatgirlCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("", str_array11);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand19 = new fredboat.command.fun.DanceCommand("hi!", str_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test325"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand16 = new fredboat.command.admin.ReviveCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test326"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.DestroyCommand destroyCommand24 = new fredboat.command.music.control.DestroyCommand("hi!", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand25 = new fredboat.command.maintenance.NodesCommand("hi!", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand26 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand27 = new fredboat.command.moderation.LanguageCommand("hi!", str_array18);
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand("hi!", str_array18);
    fredboat.command.util.WeatherCommand weatherCommand29 = new fredboat.command.util.WeatherCommand(weather3, "", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand30 = new fredboat.command.admin.ReviveCommand("", str_array18);
    fredboat.command.fun.FacedeskCommand facedeskCommand31 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test327"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = randomImageCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test328"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand11 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = restartCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test329"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("hi!", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand26 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand27 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test330"); }

    java.lang.String[] str_array1 = new java.lang.String[] {  };
    fredboat.command.maintenance.VersionCommand versionCommand2 = new fredboat.command.maintenance.VersionCommand("hi!", str_array1);
    fredboat.messaging.internal.Context context3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = versionCommand2.help(context3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test331"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand21 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand23 = new fredboat.command.music.seeking.ForwardCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("", "", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand26 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test332"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand23 = new fredboat.command.maintenance.VersionCommand("", str_array14);
    fredboat.command.music.info.ListCommand listCommand24 = new fredboat.command.music.info.ListCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = listCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test333"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.fun.HugCommand hugCommand28 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand29 = new fredboat.command.music.seeking.RestartCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand30 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array20);
    java.lang.String str31 = textCommand30.msg;
    java.lang.String str32 = textCommand30.msg;
    textCommand30.msg = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str31.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str32.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test334"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand20 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("hi!", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand26 = new fredboat.command.fun.RemoteFileCommand("", "", str_array15);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = remoteFileCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test335"); }

    java.lang.String[] str_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.PatCommand patCommand3 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test336"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand23 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel26 = restartCommand25.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand25.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test337"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel25 = disableCommandsCommand24.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test338"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand("hi!", str_array10);
    java.util.List<java.lang.String> list_str17 = mathCommand16.aliases;
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = mathCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test339"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand19 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test340"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("", str_array16);
    fredboat.command.admin.EvalCommand evalCommand21 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand24 = new fredboat.command.admin.TestCommand("", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand25 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.HugCommand hugCommand27 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    java.io.File file28 = hugCommand27.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file28);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test341"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand22 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand23 = new fredboat.command.util.ServerInfoCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand25 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand26 = new fredboat.command.util.BrainfuckCommand("hi!", str_array16);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = brainfuckCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test342"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand22 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand23 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand24 = new fredboat.command.admin.UnblacklistCommand("", str_array16);
    fredboat.perms.PermissionLevel permissionLevel25 = unblacklistCommand24.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test343"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather2, "hi!", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand21 = new fredboat.command.admin.BotRestartCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel23 = shuffleCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test344"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("", str_array20);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand28 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand29 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array20);
    fredboat.command.music.control.UnpauseCommand unpauseCommand30 = new fredboat.command.music.control.UnpauseCommand("", str_array20);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand31 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand32 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.JoinCommand joinCommand33 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.admin.BotRestartCommand botRestartCommand34 = new fredboat.command.admin.BotRestartCommand("", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand35 = new fredboat.command.music.seeking.RestartCommand("", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand36 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array20);
    fredboat.command.admin.BotRestartCommand botRestartCommand37 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test345"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand17 = new fredboat.command.music.control.LeaveCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand21 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand23 = new fredboat.command.fun.DanceCommand("hi!", str_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test346"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel19 = stopCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = stopCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand18.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test347"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("hi!", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test348"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("hi!", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = facedeskCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test349"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.EvalCommand evalCommand21 = new fredboat.command.admin.EvalCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = stopCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test350"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    textCommand20.msg = "hi!";
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = textCommand20.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test351"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand16 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test352"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = joinCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand21.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test353"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test354"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel11 = repeatCommand10.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test355"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel16 = pauseCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = pauseCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = pauseCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = pauseCommand15.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test356"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand25 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand27 = new fredboat.command.music.control.ShuffleCommand("", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = versionCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test357"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test358"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand23 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel24 = nodeAdminCommand23.getMinimumPerms();
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = nodeAdminCommand23.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test359"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("hi!", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("hi!", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand27 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.ShuffleCommand shuffleCommand28 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.PatCommand patCommand29 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test360"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test361"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand21 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand25 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand26 = new fredboat.command.util.WeatherCommand(weather0, "", str_array15);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = weatherCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test362"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("hi!", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("", str_array13);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test363"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand24 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.CommandsCommand commandsCommand25 = new fredboat.command.util.CommandsCommand("hi!", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand26 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand27 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test364"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = enableCommandsCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test365"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test366"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand18 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = playSplitCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test367"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand23 = new fredboat.command.music.control.RepeatCommand("", str_array17);
    fredboat.command.util.MathCommand mathCommand24 = new fredboat.command.util.MathCommand("", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand25 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand26 = new fredboat.command.music.info.HistoryCommand("hi!", str_array17);
    fredboat.command.fun.HugCommand hugCommand27 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.TextCommand textCommand28 = new fredboat.command.fun.TextCommand("hi!", "", str_array17);
    fredboat.command.util.BrainfuckCommand brainfuckCommand29 = new fredboat.command.util.BrainfuckCommand("hi!", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test368"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = gitInfoCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test369"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test370"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand17 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand20 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.fun.HugCommand hugCommand23 = new fredboat.command.fun.HugCommand("", "hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test371"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    remoteFileCommand9.url = "http://i.imgur.com/NqyOqnj.gif";
    java.lang.String str13 = remoteFileCommand9.url;
    remoteFileCommand9.url = "hi!";
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = remoteFileCommand9.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str13.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test372"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.BotRestartCommand botRestartCommand17 = new fredboat.command.admin.BotRestartCommand("", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test373"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = brainfuckCommand22.process("", context24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test374"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("", "", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand22 = new fredboat.command.maintenance.VersionCommand("hi!", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.music.control.PauseCommand pauseCommand25 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.BotRestartCommand botRestartCommand26 = new fredboat.command.admin.BotRestartCommand("", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand27 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = setAvatarCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test375"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("", "", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("", str_array18);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array18);
    fredboat.command.music.control.PauseCommand pauseCommand23 = new fredboat.command.music.control.PauseCommand("", str_array18);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("hi!", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand26 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("", str_array18);
    fredboat.command.music.control.LeaveCommand leaveCommand28 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand29 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand30 = new fredboat.command.util.BrainfuckCommand("", str_array18);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand31 = new fredboat.command.music.control.PlaySplitCommand("", str_array18);
    fredboat.messaging.internal.Context context32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = playSplitCommand31.help(context32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test376"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand21 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test377"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.EvalCommand evalCommand23 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand24 = new fredboat.command.admin.UnblacklistCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test378"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("", "", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test379"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand23 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    java.util.List<java.lang.String> list_str24 = leaveCommand23.aliases;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str24);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test380"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel24 = restartCommand23.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test381"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand("", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand25 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.BotRestartCommand botRestartCommand27 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test382"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand17 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("hi!", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand22 = new fredboat.command.music.control.LeaveCommand("", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = leaveCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test383"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("", str_array8);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test384"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("", str_array8);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test385"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test386"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand18 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand20 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("hi!", "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test387"); }

    java.lang.String[] str_array24 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand25 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array24);
    fredboat.command.music.info.ListCommand listCommand26 = new fredboat.command.music.info.ListCommand("", str_array24);
    fredboat.command.fun.TextCommand textCommand27 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array24);
    fredboat.command.music.control.StopCommand stopCommand28 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array24);
    fredboat.command.music.control.ShuffleCommand shuffleCommand29 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array24);
    fredboat.command.music.control.RepeatCommand repeatCommand30 = new fredboat.command.music.control.RepeatCommand("", str_array24);
    fredboat.command.util.MathCommand mathCommand31 = new fredboat.command.util.MathCommand("", str_array24);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand32 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array24);
    fredboat.command.music.info.HistoryCommand historyCommand33 = new fredboat.command.music.info.HistoryCommand("hi!", str_array24);
    fredboat.command.fun.HugCommand hugCommand34 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array24);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand35 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array24);
    fredboat.command.fun.HugCommand hugCommand36 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array24);
    fredboat.command.admin.ReviveCommand reviveCommand37 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array24);
    fredboat.command.util.BrainfuckCommand brainfuckCommand38 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array24);
    fredboat.command.maintenance.PingCommand pingCommand39 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array24);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand40 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array24);
    fredboat.command.music.control.DestroyCommand destroyCommand41 = new fredboat.command.music.control.DestroyCommand("hi!", str_array24);
    fredboat.command.fun.TextCommand textCommand42 = new fredboat.command.fun.TextCommand("hi!", "", str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test388"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("hi!", str_array11);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test389"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("hi!", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = repeatCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test390"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("hi!", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test391"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = stopCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = stopCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test392"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test393"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array18);
    fredboat.command.music.control.JoinCommand joinCommand23 = new fredboat.command.music.control.JoinCommand("hi!", str_array18);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand28 = new fredboat.command.moderation.LanguageCommand("", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand29 = new fredboat.command.moderation.LanguageCommand("hi!", str_array18);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand30 = new fredboat.command.fun.RemoteFileCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test394"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = pingCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test395"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = testCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = testCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = testCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand12.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test396"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand11 = new fredboat.command.fun.CatgirlCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test397"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test398"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand9 = new fredboat.command.admin.UpdateCommand("hi!", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = leaveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = leaveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = leaveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = leaveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = leaveCommand10.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test399"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.ReviveCommand reviveCommand8 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = reviveCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test400"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand13 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test401"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    java.lang.String str16 = remoteFileCommand15.url;
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = remoteFileCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test402"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand23 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand25 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test403"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    java.lang.String str18 = disableCommandsCommand17.name;
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = disableCommandsCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test404"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("", str_array12);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand20 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand21 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = gitInfoCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test405"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test406"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("", str_array14);
    java.util.List<java.lang.String> list_str21 = updateCommand20.aliases;
    java.lang.String str22 = updateCommand20.name;
    fredboat.perms.PermissionLevel permissionLevel23 = updateCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = updateCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test407"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand22 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand25 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand26 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test408"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = hugCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test409"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand10 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand12 = new fredboat.command.music.control.PlaySplitCommand("", str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test410"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("", str_array16);
    fredboat.command.admin.EvalCommand evalCommand21 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand24 = new fredboat.command.admin.TestCommand("", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand25 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RollCommand rollCommand26 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test411"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.admin.ReviveCommand reviveCommand8 = new fredboat.command.admin.ReviveCommand("", str_array6);
    fredboat.perms.PermissionLevel permissionLevel9 = reviveCommand8.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test412"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("", str_array17);
    fredboat.command.music.seeking.RestartCommand restartCommand26 = new fredboat.command.music.seeking.RestartCommand("", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand27 = new fredboat.command.moderation.LanguageCommand("", str_array17);
    fredboat.command.util.WeatherCommand weatherCommand28 = new fredboat.command.util.WeatherCommand(weather0, "", str_array17);
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = weatherCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test413"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    java.lang.String str20 = randomImageCommand19.getRandomImageUrl();
    java.lang.String str21 = randomImageCommand19.getRandomImageUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str20.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str21.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test414"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("", "hi!", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test415"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = setAvatarCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test416"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array12);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = unpauseCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test417"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.command.util.MathCommand mathCommand22 = new fredboat.command.util.MathCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("hi!", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand25 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand26 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand27 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test418"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("hi!", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand26 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand27 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand("", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand29 = new fredboat.command.music.control.JoinCommand("hi!", str_array17);
    fredboat.perms.PermissionLevel permissionLevel30 = joinCommand29.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test419"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array13);
    java.lang.String str20 = remoteFileCommand19.url;
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test420"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand21 = new fredboat.command.maintenance.VersionCommand("hi!", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("hi!", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel26 = stopCommand25.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand25.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test421"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test422"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand25 = new fredboat.command.admin.ReviveCommand("", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("", str_array18);
    fredboat.command.admin.UpdateCommand updateCommand27 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = updateCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test423"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array21);
    fredboat.command.music.info.ListCommand listCommand23 = new fredboat.command.music.info.ListCommand("", str_array21);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array21);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand26 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand27 = new fredboat.command.maintenance.PingCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand28 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.music.control.StopCommand stopCommand29 = new fredboat.command.music.control.StopCommand("hi!", str_array21);
    fredboat.command.admin.BotRestartCommand botRestartCommand30 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.fun.RollCommand rollCommand31 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand32 = new fredboat.command.maintenance.AudioDebugCommand("", str_array21);
    fredboat.command.fun.FacedeskCommand facedeskCommand33 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array21);
    fredboat.command.util.AvatarCommand avatarCommand34 = new fredboat.command.util.AvatarCommand("hi!", str_array21);
    fredboat.command.music.control.JoinCommand joinCommand35 = new fredboat.command.music.control.JoinCommand("", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand36 = new fredboat.command.fun.RandomImageCommand("hi!", "", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test424"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand19 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test425"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand24 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.CatgirlCommand catgirlCommand25 = new fredboat.command.fun.CatgirlCommand("hi!", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand26 = new fredboat.command.admin.UnblacklistCommand("", str_array17);
    fredboat.command.maintenance.VersionCommand versionCommand27 = new fredboat.command.maintenance.VersionCommand("hi!", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand28 = new fredboat.command.fun.RemoteFileCommand("", "", str_array17);
    java.lang.String str29 = remoteFileCommand28.url;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test426"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    java.lang.String str14 = restartCommand13.name;
    fredboat.perms.PermissionLevel permissionLevel15 = restartCommand13.getMinimumPerms();
    java.util.List<java.lang.String> list_str16 = restartCommand13.aliases;
    fredboat.perms.PermissionLevel permissionLevel17 = restartCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = restartCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = restartCommand13.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str14.equals("http://i.imgur.com/NqyOqnj.gif"));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test427"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = joinCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test428"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = exitCommand19.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test429"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand22 = new fredboat.command.admin.SetAvatarCommand("", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("", "", str_array21);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("", str_array21);
    fredboat.command.util.ServerInfoCommand serverInfoCommand25 = new fredboat.command.util.ServerInfoCommand("", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand27 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array21);
    fredboat.command.util.ServerInfoCommand serverInfoCommand28 = new fredboat.command.util.ServerInfoCommand("hi!", str_array21);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand29 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array21);
    fredboat.command.fun.RollCommand rollCommand30 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array21);
    fredboat.command.music.seeking.RestartCommand restartCommand31 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.admin.EvalCommand evalCommand32 = new fredboat.command.admin.EvalCommand("", str_array21);
    fredboat.command.fun.HugCommand hugCommand33 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.util.ServerInfoCommand serverInfoCommand34 = new fredboat.command.util.ServerInfoCommand("hi!", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test430"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test431"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = restartCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test432"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand24 = new fredboat.command.music.control.PlaySplitCommand("", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("", str_array16);
    fredboat.command.music.control.PauseCommand pauseCommand26 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand27 = new fredboat.command.util.ServerInfoCommand("hi!", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand28 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test433"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.SeekCommand seekCommand9 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = shuffleCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = shuffleCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = shuffleCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = shuffleCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = shuffleCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand10.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test434"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand18 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test435"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("hi!", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand25 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test436"); }

    fredboat.util.rest.Weather weather4 = null;
    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("", str_array20);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand28 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand29 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand30 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.info.HistoryCommand historyCommand31 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.WeatherCommand weatherCommand32 = new fredboat.command.util.WeatherCommand(weather4, "", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand33 = new fredboat.command.util.BrainfuckCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand34 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.seeking.RestartCommand restartCommand35 = new fredboat.command.music.seeking.RestartCommand("", str_array20);
    fredboat.command.music.control.JoinCommand joinCommand36 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.messaging.internal.Context context37 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str38 = joinCommand36.help(context37);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test437"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand25 = new fredboat.command.fun.TextCommand("hi!", "", str_array20);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand26 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand27 = new fredboat.command.music.control.StopCommand("hi!", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand28 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.moderation.LanguageCommand languageCommand29 = new fredboat.command.moderation.LanguageCommand("hi!", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand30 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.util.AvatarCommand avatarCommand31 = new fredboat.command.util.AvatarCommand("", str_array20);
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand31.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test438"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("", str_array18);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("", "", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array18);
    fredboat.command.music.control.RepeatCommand repeatCommand26 = new fredboat.command.music.control.RepeatCommand("", str_array18);
    fredboat.command.music.info.HistoryCommand historyCommand27 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.WeatherCommand weatherCommand28 = new fredboat.command.util.WeatherCommand(weather2, "", str_array18);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand29 = new fredboat.command.moderation.EnableCommandsCommand("", str_array18);
    fredboat.command.maintenance.VersionCommand versionCommand30 = new fredboat.command.maintenance.VersionCommand("", str_array18);
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = versionCommand30.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test439"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand24 = new fredboat.command.music.control.JoinCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand25 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand26 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand27 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = nodesCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test440"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand16 = new fredboat.command.admin.ReviveCommand("hi!", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test441"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test442"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand25 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.PatCommand patCommand27 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test443"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.admin.ReviveCommand reviveCommand10 = new fredboat.command.admin.ReviveCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = reviveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = reviveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = reviveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = reviveCommand10.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test444"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand15 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test445"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array18);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand25 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand27 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.music.seeking.RewindCommand rewindCommand28 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array18);
    fredboat.command.admin.ExitCommand exitCommand29 = new fredboat.command.admin.ExitCommand("hi!", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand30 = new fredboat.command.admin.ReviveCommand("hi!", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand31 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand31.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test446"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("hi!", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test447"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("hi!", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand21 = new fredboat.command.fun.RemoteFileCommand("", "", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand23 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test448"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("hi!", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand25 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand26 = new fredboat.command.maintenance.VersionCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand27 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand28 = new fredboat.command.util.ServerInfoCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand29 = new fredboat.command.maintenance.VersionCommand("hi!", str_array16);
    fredboat.messaging.internal.Context context30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = versionCommand29.help(context30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test449"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("hi!", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test450"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("", str_array16);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("hi!", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.CommandsCommand commandsCommand25 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.PauseCommand pauseCommand26 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.HugCommand hugCommand27 = new fredboat.command.fun.HugCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand28 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test451"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.MathCommand mathCommand23 = new fredboat.command.util.MathCommand("hi!", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand24 = new fredboat.command.music.control.PauseCommand("", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand25 = new fredboat.command.moderation.LanguageCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test452"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand26 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand27 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.admin.EvalCommand evalCommand28 = new fredboat.command.admin.EvalCommand("", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test453"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand24 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand25 = new fredboat.command.moderation.ConfigCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel26 = configCommand25.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test454"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand17 = new fredboat.command.music.seeking.ForwardCommand("", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array13);
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("hi!", "", str_array13);
    fredboat.command.admin.TestCommand testCommand22 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test455"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.seeking.RewindCommand rewindCommand27 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array17);
    fredboat.command.admin.ExitCommand exitCommand28 = new fredboat.command.admin.ExitCommand("hi!", str_array17);
    fredboat.command.admin.ReviveCommand reviveCommand29 = new fredboat.command.admin.ReviveCommand("hi!", str_array17);
    fredboat.messaging.internal.Context context30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = reviveCommand29.help(context30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test456"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array10);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand17 = new fredboat.command.fun.DanceCommand("", str_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test457"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("hi!", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand24 = new fredboat.command.admin.UpdateCommand("hi!", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand25 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand26 = new fredboat.command.util.WeatherCommand(weather1, "hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand27 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test458"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("", str_array17);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.BotRestartCommand botRestartCommand23 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test459"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("hi!", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand25 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand26 = new fredboat.command.maintenance.VersionCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand27 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand28 = new fredboat.command.util.ServerInfoCommand("hi!", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand29 = new fredboat.command.music.control.LeaveCommand("", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test460"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel21 = seekCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = seekCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test461"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test462"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "", str_array17);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    textCommand24.msg = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test463"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("hi!", "", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test464"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = avatarCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test465"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = forwardCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test466"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("", str_array11);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = disableCommandsCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = disableCommandsCommand19.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test467"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test468"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather2, "hi!", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand20 = new fredboat.command.admin.ReviveCommand("hi!", str_array13);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test469"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("", "", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.fun.RollCommand rollCommand24 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand25 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.perms.PermissionLevel permissionLevel26 = joinCommand25.getMinimumPerms();
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = joinCommand25.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test470"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test471"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test472"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array10);
    java.io.File file16 = facedeskCommand15.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file16);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test473"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = forwardCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test474"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test475"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array19);
    fredboat.command.admin.ReviveCommand reviveCommand24 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.seeking.ForwardCommand forwardCommand26 = new fredboat.command.music.seeking.ForwardCommand("", str_array19);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand27 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.UnpauseCommand unpauseCommand28 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand29 = new fredboat.command.maintenance.PingCommand("", str_array19);
    fredboat.messaging.internal.Context context30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = pingCommand29.help(context30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test476"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.util.CommandsCommand commandsCommand2 = new fredboat.command.util.CommandsCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test477"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("", "", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test478"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = weatherCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test479"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = repeatCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = repeatCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test480"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand13 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("", "", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test481"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("", str_array19);
    fredboat.command.music.info.HistoryCommand historyCommand22 = new fredboat.command.music.info.HistoryCommand("", str_array19);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand24 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array19);
    fredboat.command.maintenance.GetIdCommand getIdCommand25 = new fredboat.command.maintenance.GetIdCommand("", str_array19);
    fredboat.command.admin.ExitCommand exitCommand26 = new fredboat.command.admin.ExitCommand("hi!", str_array19);
    fredboat.command.music.seeking.RewindCommand rewindCommand27 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array19);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand28 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array19);
    fredboat.command.util.ServerInfoCommand serverInfoCommand29 = new fredboat.command.util.ServerInfoCommand("hi!", str_array19);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand30 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array19);
    fredboat.command.util.AvatarCommand avatarCommand31 = new fredboat.command.util.AvatarCommand("hi!", str_array19);
    fredboat.command.music.control.DestroyCommand destroyCommand32 = new fredboat.command.music.control.DestroyCommand("", str_array19);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand33 = new fredboat.command.admin.SetAvatarCommand("", str_array19);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand34 = new fredboat.command.maintenance.AudioDebugCommand("", str_array19);
    fredboat.command.music.control.DestroyCommand destroyCommand35 = new fredboat.command.music.control.DestroyCommand("", str_array19);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand36 = new fredboat.command.moderation.DisableCommandsCommand("", str_array19);
    fredboat.commandmeta.abs.CommandContext commandContext37 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand36.onInvoke(commandContext37);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test482"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("hi!", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("hi!", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand25 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand27 = new fredboat.command.util.AvatarCommand("hi!", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.GetIdCommand getIdCommand29 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test483"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test484"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("hi!", "", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand23 = new fredboat.command.music.control.DestroyCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = destroyCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test485"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand22 = new fredboat.command.moderation.EnableCommandsCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel23 = enableCommandsCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test486"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("hi!", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand20 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand21 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test487"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    remoteFileCommand15.url = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test488"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = unpauseCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = unpauseCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = unpauseCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test489"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("", str_array13);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("", "hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test490"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = nodeAdminCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = nodeAdminCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = nodeAdminCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand21.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test491"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand22 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand("", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test492"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand25 = new fredboat.command.fun.TextCommand("", "", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand27 = new fredboat.command.music.control.JoinCommand("", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand28 = new fredboat.command.util.BrainfuckCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test493"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test494"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("", "", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array17);
    fredboat.command.admin.TestCommand testCommand22 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("hi!", str_array17);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand24 = new fredboat.command.music.control.ReshuffleCommand("", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand27 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand28 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test495"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = reshuffleCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test496"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand22 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.command.music.info.ListCommand listCommand23 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = listCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test497"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    java.lang.String str24 = rollCommand23.getRandomImageUrl();
    java.io.File file25 = rollCommand23.getRandomFile();
    java.lang.String str26 = rollCommand23.getRandomImageUrl();
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = rollCommand23.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str24.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str26.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test498"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("hi!", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array12);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("hi!", "hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = rollCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test499"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand11 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand12 = new fredboat.command.admin.ReviveCommand("hi!", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand("hi!", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test500"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("", str_array13);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

}

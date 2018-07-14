
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test001"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = getIdCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test002"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    java.lang.String str19 = facedeskCommand18.getRandomImageUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str19.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test003"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("hi!", str_array13);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
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
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test004"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = testCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = testCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test005"); }

    fredboat.util.rest.Weather weather0 = null;
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
    fredboat.command.music.control.LeaveCommand leaveCommand26 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand27 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand28 = new fredboat.command.util.WeatherCommand(weather0, "", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test006"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand15 = new fredboat.command.maintenance.PingCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test007"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand21 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand24 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand25 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test008"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.admin.ReviveCommand reviveCommand23 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.LeaveCommand leaveCommand25 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.BotRestartCommand botRestartCommand26 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand27 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test009"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test010"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand21 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = testCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = testCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand21.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test011"); }

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
    fredboat.perms.PermissionLevel permissionLevel32 = destroyCommand29.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel32 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel32.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test012"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array20);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand25 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand27 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.music.control.StopCommand stopCommand28 = new fredboat.command.music.control.StopCommand("hi!", str_array20);
    fredboat.command.admin.BotRestartCommand botRestartCommand29 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.fun.RollCommand rollCommand30 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand31 = new fredboat.command.maintenance.AudioDebugCommand("", str_array20);
    fredboat.command.fun.FacedeskCommand facedeskCommand32 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array20);
    fredboat.command.util.AvatarCommand avatarCommand33 = new fredboat.command.util.AvatarCommand("hi!", str_array20);
    fredboat.command.music.control.JoinCommand joinCommand34 = new fredboat.command.music.control.JoinCommand("", str_array20);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand35 = new fredboat.command.music.control.PlaySplitCommand("", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test013"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("hi!", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test014"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("", "", str_array21);
    fredboat.command.fun.CatgirlCommand catgirlCommand27 = new fredboat.command.fun.CatgirlCommand("", str_array21);
    fredboat.command.music.control.LeaveCommand leaveCommand28 = new fredboat.command.music.control.LeaveCommand("hi!", str_array21);
    fredboat.command.fun.FacedeskCommand facedeskCommand29 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.admin.ExitCommand exitCommand30 = new fredboat.command.admin.ExitCommand("hi!", str_array21);
    fredboat.command.fun.HugCommand hugCommand31 = new fredboat.command.fun.HugCommand("hi!", "", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test015"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand22 = new fredboat.command.fun.CatgirlCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test016"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test017"); }

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
    fredboat.command.music.seeking.ForwardCommand forwardCommand30 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array20);
    fredboat.perms.PermissionLevel permissionLevel31 = forwardCommand30.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand30.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test018"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("hi!", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand22 = new fredboat.command.music.control.LeaveCommand("hi!", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.EvalCommand evalCommand24 = new fredboat.command.admin.EvalCommand("", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand25 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand26 = new fredboat.command.fun.FacedeskCommand("", "", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test019"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = botRestartCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = botRestartCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test020"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("", "", str_array19);
    fredboat.command.music.info.HistoryCommand historyCommand25 = new fredboat.command.music.info.HistoryCommand("", str_array19);
    fredboat.command.music.control.RepeatCommand repeatCommand26 = new fredboat.command.music.control.RepeatCommand("hi!", str_array19);
    fredboat.command.fun.PatCommand patCommand27 = new fredboat.command.fun.PatCommand("hi!", "", str_array19);
    fredboat.command.moderation.LanguageCommand languageCommand28 = new fredboat.command.moderation.LanguageCommand("", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test021"); }

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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test022"); }

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
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = avatarCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test023"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array13);
    java.io.File file23 = patCommand22.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file23);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test024"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.fun.TextCommand textCommand26 = new fredboat.command.fun.TextCommand("hi!", "", str_array21);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand27 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array21);
    fredboat.command.music.control.StopCommand stopCommand28 = new fredboat.command.music.control.StopCommand("hi!", str_array21);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand29 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.moderation.LanguageCommand languageCommand30 = new fredboat.command.moderation.LanguageCommand("hi!", str_array21);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand31 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.admin.BotRestartCommand botRestartCommand32 = new fredboat.command.admin.BotRestartCommand("hi!", str_array21);
    fredboat.command.music.control.DestroyCommand destroyCommand33 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test025"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand21 = new fredboat.command.util.CommandsCommand("", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand22 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test026"); }

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
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = reshuffleCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test027"); }

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
    fredboat.messaging.internal.Context context33 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = textCommand30.help(context33);
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test028"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test029"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand20 = new fredboat.command.fun.CatgirlCommand("hi!", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand22 = new fredboat.command.music.control.PauseCommand("", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand23 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test030"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.command.util.MathCommand mathCommand22 = new fredboat.command.util.MathCommand("", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand26 = new fredboat.command.fun.RemoteFileCommand("", "hi!", str_array15);
    remoteFileCommand26.url = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test031"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("hi!", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand20 = new fredboat.command.music.control.LeaveCommand("hi!", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.EvalCommand evalCommand22 = new fredboat.command.admin.EvalCommand("", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand23 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = nodesCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test032"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.WeatherCommand weatherCommand11 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array7);
    java.util.List<java.lang.String> list_str12 = weatherCommand11.aliases;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test033"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test034"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("hi!", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test035"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand17 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test036"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel19 = nodeAdminCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = nodeAdminCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test037"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand21 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("hi!", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand24 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand25 = new fredboat.command.fun.RemoteFileCommand("", "", str_array16);
    fredboat.command.admin.ReviveCommand reviveCommand26 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand27 = new fredboat.command.admin.UnblacklistCommand("", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand28 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test038"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("hi!", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand20 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test039"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array20);
    fredboat.command.fun.PatCommand patCommand24 = new fredboat.command.fun.PatCommand("", "", str_array20);
    fredboat.command.admin.UpdateCommand updateCommand25 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.maintenance.NodesCommand nodesCommand26 = new fredboat.command.maintenance.NodesCommand("", str_array20);
    fredboat.command.fun.FacedeskCommand facedeskCommand27 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand28 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array20);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand29 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array20);
    fredboat.command.admin.TestCommand testCommand30 = new fredboat.command.admin.TestCommand("hi!", str_array20);
    fredboat.command.maintenance.VersionCommand versionCommand31 = new fredboat.command.maintenance.VersionCommand("", str_array20);
    fredboat.command.maintenance.NodesCommand nodesCommand32 = new fredboat.command.maintenance.NodesCommand("hi!", str_array20);
    fredboat.command.fun.RollCommand rollCommand33 = new fredboat.command.fun.RollCommand("hi!", "", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test040"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel19 = evalCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = evalCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = evalCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = evalCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test041"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand22 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = stopCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test042"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand21 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("hi!", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array16);
    fredboat.command.fun.HugCommand hugCommand26 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand27 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand28 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test043"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array15);
    fredboat.command.util.MathCommand mathCommand23 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand24 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.EvalCommand evalCommand26 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel27 = evalCommand26.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test044"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("", "", str_array11);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = facedeskCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test045"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = exitCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = exitCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand15.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test046"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand22 = new fredboat.command.maintenance.VersionCommand("", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand23 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test047"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.HugCommand hugCommand26 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("", str_array18);
    fredboat.perms.PermissionLevel permissionLevel28 = restartCommand27.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test048"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("", str_array12);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test049"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand22 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.MathCommand mathCommand23 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test050"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("", "", str_array17);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand24 = new fredboat.command.util.ServerInfoCommand("hi!", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array17);
    fredboat.command.fun.RollCommand rollCommand26 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.music.control.StopCommand stopCommand27 = new fredboat.command.music.control.StopCommand("", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test051"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test052"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = unpauseCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test053"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "hi!", str_array9);
    java.io.File file15 = randomImageCommand14.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file15);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test054"); }

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
    fredboat.command.fun.HugCommand hugCommand30 = new fredboat.command.fun.HugCommand("", "hi!", str_array19);
    fredboat.command.music.control.RepeatCommand repeatCommand31 = new fredboat.command.music.control.RepeatCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand32 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.UnpauseCommand unpauseCommand33 = new fredboat.command.music.control.UnpauseCommand("", str_array19);
    fredboat.commandmeta.abs.CommandContext commandContext34 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand33.onInvoke(commandContext34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test055"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand17 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = reshuffleCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = reshuffleCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test056"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel21 = exitCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = exitCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test057"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel14 = nodeAdminCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = nodeAdminCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand13.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test058"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = historyCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test059"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand17 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand22 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array14);
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.TestCommand testCommand24 = new fredboat.command.admin.TestCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel25 = testCommand24.getMinimumPerms();
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = testCommand24.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test060"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array13);
    java.lang.String str20 = remoteFileCommand19.url;
    remoteFileCommand19.url = "";
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand19.onInvoke(commandContext23);
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test061"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test062"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand21 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand24 = new fredboat.command.music.control.DestroyCommand("hi!", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand26 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.admin.ExitCommand exitCommand27 = new fredboat.command.admin.ExitCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel28 = exitCommand27.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel29 = exitCommand27.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test063"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array20);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array20);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("", "", str_array20);
    fredboat.command.fun.CatgirlCommand catgirlCommand26 = new fredboat.command.fun.CatgirlCommand("", str_array20);
    fredboat.command.music.control.LeaveCommand leaveCommand27 = new fredboat.command.music.control.LeaveCommand("hi!", str_array20);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array20);
    fredboat.command.fun.PatCommand patCommand29 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test064"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand14 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = reshuffleCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test065"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel16 = reviveCommand15.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test066"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = reshuffleCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test067"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand21 = new fredboat.command.maintenance.VersionCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test068"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test069"); }

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
    fredboat.command.admin.ExitCommand exitCommand24 = new fredboat.command.admin.ExitCommand("", str_array14);
    fredboat.command.util.MathCommand mathCommand25 = new fredboat.command.util.MathCommand("hi!", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand26 = new fredboat.command.music.control.PauseCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test070"); }

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
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test071"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test072"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("hi!", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand22 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("", "", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand24 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.perms.PermissionLevel permissionLevel25 = reviveCommand24.getMinimumPerms();
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = reviveCommand24.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test073"); }

    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.util.ServerInfoCommand serverInfoCommand22 = new fredboat.command.util.ServerInfoCommand("", str_array20);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("", str_array20);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand24 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array20);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array20);
    fredboat.command.maintenance.GetIdCommand getIdCommand26 = new fredboat.command.maintenance.GetIdCommand("", str_array20);
    fredboat.command.admin.ExitCommand exitCommand27 = new fredboat.command.admin.ExitCommand("hi!", str_array20);
    fredboat.command.music.seeking.RewindCommand rewindCommand28 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array20);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand29 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array20);
    fredboat.command.util.ServerInfoCommand serverInfoCommand30 = new fredboat.command.util.ServerInfoCommand("hi!", str_array20);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand31 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array20);
    fredboat.command.util.AvatarCommand avatarCommand32 = new fredboat.command.util.AvatarCommand("hi!", str_array20);
    fredboat.command.music.control.DestroyCommand destroyCommand33 = new fredboat.command.music.control.DestroyCommand("", str_array20);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand34 = new fredboat.command.admin.SetAvatarCommand("", str_array20);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand35 = new fredboat.command.maintenance.AudioDebugCommand("", str_array20);
    fredboat.command.music.control.DestroyCommand destroyCommand36 = new fredboat.command.music.control.DestroyCommand("", str_array20);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand37 = new fredboat.command.moderation.DisableCommandsCommand("", str_array20);
    fredboat.command.music.control.StopCommand stopCommand38 = new fredboat.command.music.control.StopCommand("hi!", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test074"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "", str_array19);
    fredboat.command.music.control.JoinCommand joinCommand24 = new fredboat.command.music.control.JoinCommand("hi!", str_array19);
    fredboat.command.fun.TextCommand textCommand25 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand26 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array19);
    fredboat.command.maintenance.VersionCommand versionCommand27 = new fredboat.command.maintenance.VersionCommand("", str_array19);
    fredboat.command.music.control.JoinCommand joinCommand28 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.VersionCommand versionCommand29 = new fredboat.command.maintenance.VersionCommand("", str_array19);
    fredboat.command.music.control.LeaveCommand leaveCommand30 = new fredboat.command.music.control.LeaveCommand("hi!", str_array19);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand31 = new fredboat.command.fun.RemoteFileCommand("", "", str_array19);
    fredboat.command.admin.BotRestartCommand botRestartCommand32 = new fredboat.command.admin.BotRestartCommand("hi!", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test075"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand23 = new fredboat.command.admin.BotRestartCommand("hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test076"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    java.lang.String str11 = textCommand9.msg;
    textCommand9.msg = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test077"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array13);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand22 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand23 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand24 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel25 = playSplitCommand24.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel26 = playSplitCommand24.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel27 = playSplitCommand24.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test078"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test079"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand22 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array18);
    fredboat.command.fun.HugCommand hugCommand24 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array18);
    fredboat.command.music.control.UnpauseCommand unpauseCommand25 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.RollCommand rollCommand26 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand27 = new fredboat.command.admin.UnblacklistCommand("", str_array18);
    fredboat.command.music.control.PauseCommand pauseCommand28 = new fredboat.command.music.control.PauseCommand("hi!", str_array18);
    fredboat.command.music.control.JoinCommand joinCommand29 = new fredboat.command.music.control.JoinCommand("hi!", str_array18);
    fredboat.perms.PermissionLevel permissionLevel30 = joinCommand29.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel31 = joinCommand29.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel32 = joinCommand29.getMinimumPerms();
    fredboat.messaging.internal.Context context33 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = joinCommand29.help(context33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel32 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel32.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test080"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array14);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand22 = new fredboat.command.util.WeatherCommand(weather1, "hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand23 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test081"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test082"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand21 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand22 = new fredboat.command.util.ServerInfoCommand("hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test083"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = pauseCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = pauseCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = pauseCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test084"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.fun.HugCommand hugCommand23 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand26 = new fredboat.command.util.AvatarCommand("hi!", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand27 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test085"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array13);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand22 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand23 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = avatarCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test086"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("", str_array18);
    fredboat.command.admin.TestCommand testCommand21 = new fredboat.command.admin.TestCommand("hi!", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("", str_array18);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.ExitCommand exitCommand24 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand25 = new fredboat.command.fun.RemoteFileCommand("", "", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand26 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array18);
    fredboat.command.fun.TextCommand textCommand27 = new fredboat.command.fun.TextCommand("", "hi!", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand28 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array18);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand29 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand30 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array18);
    fredboat.command.util.ServerInfoCommand serverInfoCommand31 = new fredboat.command.util.ServerInfoCommand("hi!", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test087"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand17 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("", str_array14);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = stopCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test088"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand24 = new fredboat.command.music.control.LeaveCommand("", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand25 = new fredboat.command.music.control.LeaveCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel26 = leaveCommand25.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand25.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test089"); }

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
    fredboat.command.fun.HugCommand hugCommand26 = new fredboat.command.fun.HugCommand("", "", str_array16);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = hugCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test090"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand23 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("hi!", str_array14);
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test091"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("hi!", str_array12);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test092"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("hi!", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand23 = new fredboat.command.moderation.EnableCommandsCommand("", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand24 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand25 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.TestCommand testCommand26 = new fredboat.command.admin.TestCommand("", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand27 = new fredboat.command.util.CommandsCommand("", str_array15);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = commandsCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test093"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand20 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand22 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.EvalCommand evalCommand23 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test094"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand11 = new fredboat.command.music.control.JoinCommand("hi!", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("hi!", str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test095"); }

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
    fredboat.command.admin.ExitCommand exitCommand30 = new fredboat.command.admin.ExitCommand("hi!", str_array19);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand31 = new fredboat.command.admin.NodeAdminCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand32 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test096"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand13 = new fredboat.command.admin.UpdateCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = updateCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test097"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array12);
    java.util.List<java.lang.String> list_str19 = hugCommand18.aliases;
    java.lang.String str20 = hugCommand18.getRandomImageUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str20.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test098"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = reshuffleCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test099"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("hi!", str_array12);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = mathCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test100"); }

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
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand28 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test101"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("hi!", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("hi!", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand26 = new fredboat.command.music.seeking.ForwardCommand("", str_array17);
    fredboat.command.fun.PatCommand patCommand27 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand28 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array17);
    fredboat.command.music.seeking.RestartCommand restartCommand29 = new fredboat.command.music.seeking.RestartCommand("", str_array17);
    fredboat.perms.PermissionLevel permissionLevel30 = restartCommand29.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel31 = restartCommand29.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test102"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test103"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("hi!", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand26 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.PauseCommand pauseCommand27 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test104"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("", str_array18);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("", "", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand23 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.admin.EvalCommand evalCommand25 = new fredboat.command.admin.EvalCommand("hi!", str_array18);
    fredboat.command.fun.CatgirlCommand catgirlCommand26 = new fredboat.command.fun.CatgirlCommand("", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand27 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.moderation.ConfigCommand configCommand28 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand29 = new fredboat.command.util.BrainfuckCommand("", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand30 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand31 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test105"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand23 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = enableCommandsCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test106"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.EvalCommand evalCommand24 = new fredboat.command.admin.EvalCommand("hi!", str_array17);
    fredboat.command.admin.TestCommand testCommand25 = new fredboat.command.admin.TestCommand("", str_array17);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand26 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand27 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test107"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand20 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = setAvatarCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test108"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test109"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = nodeAdminCommand16.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = nodeAdminCommand16.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test110"); }

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
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.fun.TextCommand textCommand28 = new fredboat.command.fun.TextCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand29 = new fredboat.command.maintenance.AudioDebugCommand("", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test111"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test112"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array13);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand22 = new fredboat.command.util.CommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("", str_array13);
    fredboat.command.music.info.ListCommand listCommand24 = new fredboat.command.music.info.ListCommand("", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test113"); }

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
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = nodesCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test114"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.admin.ReviveCommand reviveCommand26 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand27 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.music.seeking.ForwardCommand forwardCommand28 = new fredboat.command.music.seeking.ForwardCommand("", str_array21);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand29 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.music.control.UnpauseCommand unpauseCommand30 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand31 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.util.AvatarCommand avatarCommand32 = new fredboat.command.util.AvatarCommand("", str_array21);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand33 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test115"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = forwardCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test116"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand13 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand14 = new fredboat.command.moderation.ConfigCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test117"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("hi!", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test118"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array12);
    java.lang.String str21 = facedeskCommand20.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand20.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str21.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test119"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    java.util.List<java.lang.String> list_str18 = disableCommandsCommand17.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test120"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("", "", str_array10);
    textCommand17.msg = "hi!";
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = textCommand17.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test121"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand26 = new fredboat.command.fun.RandomImageCommand("", "", str_array21);
    fredboat.command.music.info.HistoryCommand historyCommand27 = new fredboat.command.music.info.HistoryCommand("", str_array21);
    fredboat.command.fun.RollCommand rollCommand28 = new fredboat.command.fun.RollCommand("", "hi!", str_array21);
    fredboat.command.admin.ReviveCommand reviveCommand29 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.admin.ExitCommand exitCommand30 = new fredboat.command.admin.ExitCommand("", str_array21);
    fredboat.command.fun.PatCommand patCommand31 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array21);
    java.lang.String str32 = patCommand31.getRandomImageUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str32.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

}

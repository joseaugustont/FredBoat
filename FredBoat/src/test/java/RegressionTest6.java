
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test001"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand27 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand28 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.info.HistoryCommand historyCommand29 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.WeatherCommand weatherCommand30 = new fredboat.command.util.WeatherCommand(weather2, "", str_array18);
    fredboat.command.fun.PatCommand patCommand31 = new fredboat.command.fun.PatCommand("", "", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test002"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand23 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel26 = reshuffleCommand25.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel27 = reshuffleCommand25.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand25.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test003"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand20 = new fredboat.command.admin.ReviveCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test004"); }

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
    fredboat.command.admin.SetAvatarCommand setAvatarCommand26 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand27 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = forwardCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test005"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("", str_array12);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = unpauseCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = unpauseCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = unpauseCommand19.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test006"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("hi!", "", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test007"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test008"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("hi!", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test009"); }

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
    fredboat.command.music.control.PlaySplitCommand playSplitCommand25 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel26 = playSplitCommand25.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel27 = playSplitCommand25.getMinimumPerms();
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = playSplitCommand25.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test010"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand17 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = reshuffleCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test011"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather3, "hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test012"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand23 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand24 = new fredboat.command.music.control.LeaveCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel25 = leaveCommand24.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand24.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test013"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    java.util.List<java.lang.String> list_str17 = listCommand16.aliases;
    java.util.List<java.lang.String> list_str18 = listCommand16.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand16.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test014"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand18 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel19 = botRestartCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = botRestartCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test015"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand24 = new fredboat.command.maintenance.GetIdCommand("", str_array16);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = getIdCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test016"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = playSplitCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test017"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.command.admin.EvalCommand evalCommand13 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test018"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test019"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("hi!", str_array13);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test020"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test021"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand20 = new fredboat.command.maintenance.VersionCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = commandsCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test022"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand15 = new fredboat.command.fun.CatgirlCommand("", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test023"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test024"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand("", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = getIdCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test025"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand13 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test026"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand9 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array7);
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test027"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test028"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("hi!", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array9);
    java.lang.String str16 = remoteFileCommand15.url;
    remoteFileCommand15.url = "http://i.imgur.com/NqyOqnj.gif";
    remoteFileCommand15.url = "hi!";
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = remoteFileCommand15.help(context21);
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
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test029"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("hi!", str_array7);
    fredboat.command.moderation.ConfigCommand configCommand12 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = configCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = configCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test030"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather2, "hi!", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("", str_array14);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel23 = stopCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test031"); }

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
    fredboat.command.music.control.LeaveCommand leaveCommand30 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.perms.PermissionLevel permissionLevel31 = leaveCommand30.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test032"); }

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
    fredboat.command.moderation.LanguageCommand languageCommand30 = new fredboat.command.moderation.LanguageCommand("hi!", str_array19);
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = languageCommand30.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test033"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = repeatCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = repeatCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = repeatCommand11.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test034"); }

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
    fredboat.command.util.BrainfuckCommand brainfuckCommand28 = new fredboat.command.util.BrainfuckCommand("", str_array17);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand29 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array17);
    java.lang.String str30 = disableCommandsCommand29.name;
    fredboat.commandmeta.abs.CommandContext commandContext31 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand29.onInvoke(commandContext31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test035"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test036"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("hi!", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("", str_array16);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test037"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("hi!", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand22 = new fredboat.command.fun.RemoteFileCommand("", "", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand23 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array15);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("", "hi!", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = restartCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test038"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand11 = new fredboat.command.admin.UpdateCommand("", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test039"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("hi!", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand23 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = setAvatarCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test040"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.seeking.RestartCommand restartCommand2 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test041"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("", str_array17);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("", str_array17);
    fredboat.perms.PermissionLevel permissionLevel26 = reshuffleCommand25.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand25.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test042"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("hi!", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand24 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand26 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.MathCommand mathCommand27 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand28 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test043"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("hi!", "", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = disableCommandsCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test044"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("hi!", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand17 = new fredboat.command.admin.BotRestartCommand("hi!", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = gitInfoCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test045"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = leaveCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test046"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = brainfuckCommand19.process("", context21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test047"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test048"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel21 = updateCommand20.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand20.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test049"); }

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
    fredboat.command.admin.SetAvatarCommand setAvatarCommand23 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand24 = new fredboat.command.util.ServerInfoCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = serverInfoCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test050"); }

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
    fredboat.command.maintenance.NodesCommand nodesCommand28 = new fredboat.command.maintenance.NodesCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test051"); }

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
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand26 = new fredboat.command.moderation.EnableCommandsCommand("", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test052"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand23 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand24 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = updateCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test053"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.music.control.PauseCommand pauseCommand20 = new fredboat.command.music.control.PauseCommand("", str_array15);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand23 = new fredboat.command.music.control.JoinCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand24 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = avatarCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test054"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand21 = new fredboat.command.fun.FacedeskCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.admin.EvalCommand evalCommand23 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.perms.PermissionLevel permissionLevel25 = seekCommand24.getMinimumPerms();
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = seekCommand24.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test055"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand11 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("hi!", "", str_array9);
    java.io.File file16 = rollCommand15.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file16);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test056"); }

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
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test057"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    java.lang.String str19 = brainfuckCommand18.name;
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = brainfuckCommand18.process("", context21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str19.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test058"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = repeatCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test059"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test060"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel11 = restartCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = restartCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = restartCommand10.getMinimumPerms();
    java.lang.String str14 = restartCommand10.name;
    fredboat.perms.PermissionLevel permissionLevel15 = restartCommand10.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test061"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test062"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test063"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("hi!", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand18 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = leaveCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test064"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test065"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test066"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("hi!", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.BotRestartCommand botRestartCommand19 = new fredboat.command.admin.BotRestartCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = botRestartCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = botRestartCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = botRestartCommand19.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test067"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand9 = new fredboat.command.admin.UpdateCommand("hi!", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = leaveCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test068"); }

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
    fredboat.command.maintenance.NodesCommand nodesCommand29 = new fredboat.command.maintenance.NodesCommand("hi!", str_array18);
    fredboat.command.music.control.LeaveCommand leaveCommand30 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.perms.PermissionLevel permissionLevel31 = leaveCommand30.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand30.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test069"); }

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
    fredboat.command.admin.ExitCommand exitCommand32 = new fredboat.command.admin.ExitCommand("hi!", str_array19);
    fredboat.command.maintenance.VersionCommand versionCommand33 = new fredboat.command.maintenance.VersionCommand("", str_array19);
    fredboat.command.music.seeking.RestartCommand restartCommand34 = new fredboat.command.music.seeking.RestartCommand("", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test070"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = unblacklistCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = unblacklistCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand11.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test071"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("", str_array14);
    java.util.List<java.lang.String> list_str21 = updateCommand20.aliases;
    fredboat.perms.PermissionLevel permissionLevel22 = updateCommand20.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = updateCommand20.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand20.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test072"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = forwardCommand19.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test073"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand22 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test074"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "", str_array11);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
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
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test075"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array16);
    fredboat.command.admin.TestCommand testCommand21 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand22 = new fredboat.command.fun.CatgirlCommand("hi!", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("", str_array16);
    fredboat.command.util.MathCommand mathCommand25 = new fredboat.command.util.MathCommand("", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand27 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test076"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand23 = new fredboat.command.maintenance.GitInfoCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test077"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand27 = new fredboat.command.maintenance.AudioDebugCommand("", str_array18);
    fredboat.command.music.control.RepeatCommand repeatCommand28 = new fredboat.command.music.control.RepeatCommand("", str_array18);
    fredboat.command.fun.RollCommand rollCommand29 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.fun.PatCommand patCommand30 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.RepeatCommand repeatCommand31 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test078"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand21 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test079"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand16 = new fredboat.command.moderation.LanguageCommand("", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = languageCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test080"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("", str_array5);
    java.util.List<java.lang.String> list_str9 = unblacklistCommand8.aliases;
    fredboat.perms.PermissionLevel permissionLevel10 = unblacklistCommand8.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test081"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand20 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand21 = new fredboat.command.maintenance.GitInfoCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand23 = new fredboat.command.admin.ReviveCommand("", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand24 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand26 = new fredboat.command.moderation.ConfigCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test082"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("hi!", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test083"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = updateCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test084"); }

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
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = textCommand30.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test085"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand23 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test086"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("", str_array8);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = updateCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test087"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = enableCommandsCommand16.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test088"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("hi!", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test089"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.UnblacklistCommand unblacklistCommand2 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test090"); }

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
    fredboat.command.music.seeking.ForwardCommand forwardCommand27 = new fredboat.command.music.seeking.ForwardCommand("", str_array17);
    fredboat.command.fun.PatCommand patCommand28 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.PauseCommand pauseCommand29 = new fredboat.command.music.control.PauseCommand("hi!", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test091"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("hi!", str_array13);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test092"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand21 = new fredboat.command.music.control.LeaveCommand("", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array16);
    fredboat.command.admin.BotRestartCommand botRestartCommand23 = new fredboat.command.admin.BotRestartCommand("", str_array16);
    fredboat.command.music.info.ListCommand listCommand24 = new fredboat.command.music.info.ListCommand("hi!", str_array16);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = listCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test093"); }

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
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test094"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("", str_array11);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("hi!", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test095"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = exitCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = exitCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test096"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test097"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("hi!", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = joinCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test098"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    java.util.List<java.lang.String> list_str16 = leaveCommand15.aliases;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test099"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand12 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = playSplitCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = playSplitCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand12.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test100"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand13 = new fredboat.command.music.control.RepeatCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel14 = repeatCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = repeatCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test101"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand10 = new fredboat.command.fun.CatgirlCommand("hi!", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = testCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand12.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test102"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("hi!", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand25 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = weatherCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test103"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = joinCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = joinCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = joinCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test104"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("hi!", str_array9);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = hugCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test105"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel20 = disableCommandsCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = disableCommandsCommand19.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test106"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("", str_array14);
    java.util.List<java.lang.String> list_str21 = updateCommand20.aliases;
    java.lang.String str22 = updateCommand20.name;
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand20.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test107"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.EvalCommand evalCommand22 = new fredboat.command.admin.EvalCommand("hi!", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand23 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test108"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("hi!", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("hi!", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand22 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test109"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("hi!", str_array10);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = testCommand16.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test110"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand15 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = commandsCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test111"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "hi!", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = patCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test112"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel14 = unpauseCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = unpauseCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test113"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("", str_array12);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = exitCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test114"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("hi!", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test115"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand22 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand23 = new fredboat.command.music.control.PauseCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test116"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = catgirlCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test117"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test118"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test119"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test120"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand18 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = enableCommandsCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test121"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand17 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("hi!", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = brainfuckCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test122"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = updateCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = updateCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = updateCommand14.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test123"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("", str_array17);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("hi!", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("", str_array17);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = reshuffleCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test124"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel23 = restartCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test125"); }

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
    java.lang.String str25 = brainfuckCommand22.process("http://i.imgur.com/NqyOqnj.gif", context24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test126"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    java.lang.String str24 = randomImageCommand23.getRandomImageUrl();
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = randomImageCommand23.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str24.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test127"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand21 = new fredboat.command.fun.DanceCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test128"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("hi!", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("hi!", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test129"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("hi!", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test130"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand15 = new fredboat.command.fun.CatgirlCommand("", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test131"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand4 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array3);
    fredboat.perms.PermissionLevel permissionLevel5 = unblacklistCommand4.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel6 = unblacklistCommand4.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel7 = unblacklistCommand4.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = unblacklistCommand4.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel5 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel5.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test132"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("", str_array14);
    fredboat.perms.PermissionLevel permissionLevel21 = seekCommand20.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = seekCommand20.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test133"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("hi!", "", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = catgirlCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test134"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = repeatCommand14.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test135"); }

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
    fredboat.command.moderation.ConfigCommand configCommand35 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.messaging.internal.Context context36 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str37 = configCommand35.help(context36);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test136"); }

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
    fredboat.command.moderation.ConfigCommand configCommand35 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.commandmeta.abs.CommandContext commandContext36 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand35.onInvoke(commandContext36);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test137"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.StopCommand stopCommand11 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = stopCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = stopCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = stopCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = stopCommand11.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test138"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test139"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand20 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array12);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    textCommand21.msg = "hi!";
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand21.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test140"); }

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
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand28 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.perms.PermissionLevel permissionLevel29 = nodeAdminCommand28.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand28.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test141"); }

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
    fredboat.command.music.seeking.RewindCommand rewindCommand24 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test142"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = unpauseCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test143"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test144"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("", "", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.EvalCommand evalCommand23 = new fredboat.command.admin.EvalCommand("hi!", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand26 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand27 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test145"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand19 = new fredboat.command.music.control.LeaveCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = leaveCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test146"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test147"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = seekCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test148"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand10 = new fredboat.command.util.BrainfuckCommand("", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand11 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test149"); }

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
    fredboat.command.util.ServerInfoCommand serverInfoCommand23 = new fredboat.command.util.ServerInfoCommand("hi!", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test150"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand22 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array16);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("hi!", str_array16);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = stopCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test151"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    textCommand9.msg = "http://i.imgur.com/NqyOqnj.gif";
    java.lang.String str12 = textCommand9.msg;
    java.lang.String str13 = textCommand9.msg;
    textCommand9.msg = "hi!";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str12.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str13.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test152"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("hi!", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand17 = new fredboat.command.admin.ReviveCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = reviveCommand17.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test153"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = nodeAdminCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = nodeAdminCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = nodeAdminCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = nodeAdminCommand19.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test154"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test155"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    java.lang.String str18 = disableCommandsCommand17.name;
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand17.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test156"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = rewindCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test157"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("hi!", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand22 = new fredboat.command.admin.ReviveCommand("", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.util.MathCommand mathCommand26 = new fredboat.command.util.MathCommand("", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test158"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test159"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = destroyCommand19.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test160"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = playSplitCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = playSplitCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = playSplitCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = playSplitCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = playSplitCommand15.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test161"); }

    fredboat.util.rest.Weather weather1 = null;
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
    fredboat.command.util.WeatherCommand weatherCommand24 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test162"); }

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
    fredboat.command.music.control.ShuffleCommand shuffleCommand27 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand28 = new fredboat.command.maintenance.PingCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test163"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("", str_array19);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.ShuffleCommand shuffleCommand27 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand28 = new fredboat.command.maintenance.AudioDebugCommand("", str_array19);
    fredboat.command.music.control.RepeatCommand repeatCommand29 = new fredboat.command.music.control.RepeatCommand("", str_array19);
    fredboat.command.fun.RollCommand rollCommand30 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.fun.PatCommand patCommand31 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.PauseCommand pauseCommand32 = new fredboat.command.music.control.PauseCommand("", str_array19);
    fredboat.command.music.seeking.RewindCommand rewindCommand33 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test164"); }

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
    fredboat.command.music.control.ShuffleCommand shuffleCommand27 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand28 = new fredboat.command.maintenance.PingCommand("hi!", str_array16);
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = pingCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test165"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test166"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("hi!", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = randomImageCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test167"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("", "", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.BotRestartCommand botRestartCommand26 = new fredboat.command.admin.BotRestartCommand("hi!", str_array17);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand27 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test168"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test169"); }

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
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = brainfuckCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test170"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand23 = new fredboat.command.admin.BotRestartCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel24 = botRestartCommand23.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand23.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test171"); }

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
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array13);
    java.lang.String str24 = patCommand23.getRandomImageUrl();
    java.io.File file25 = patCommand23.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str24.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file25);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test172"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand27 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.perms.PermissionLevel permissionLevel28 = joinCommand27.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand27.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test173"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.LeaveCommand leaveCommand2 = new fredboat.command.music.control.LeaveCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test174"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand20 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test175"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = rollCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test176"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel23 = configCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test177"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand23 = new fredboat.command.admin.BotRestartCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = botRestartCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test178"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("hi!", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = shuffleCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test179"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = rollCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test180"); }

    java.lang.String[] str_array21 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array21);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.music.seeking.ForwardCommand forwardCommand26 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.music.info.HistoryCommand historyCommand27 = new fredboat.command.music.info.HistoryCommand("", str_array21);
    fredboat.command.fun.RandomImageCommand randomImageCommand28 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array21);
    fredboat.command.moderation.LanguageCommand languageCommand29 = new fredboat.command.moderation.LanguageCommand("hi!", str_array21);
    fredboat.command.util.ServerInfoCommand serverInfoCommand30 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array21);
    fredboat.command.maintenance.VersionCommand versionCommand31 = new fredboat.command.maintenance.VersionCommand("", str_array21);
    fredboat.command.fun.TextCommand textCommand32 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array21);
    fredboat.commandmeta.abs.CommandContext commandContext33 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand32.onInvoke(commandContext33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test181"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand11 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand15 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand16 = new fredboat.command.moderation.ConfigCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = configCommand16.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test182"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.perms.PermissionLevel permissionLevel22 = destroyCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand21.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test183"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand9 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("hi!", str_array7);
    fredboat.command.fun.HugCommand hugCommand11 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test184"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    fredboat.command.admin.BotRestartCommand botRestartCommand19 = new fredboat.command.admin.BotRestartCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = botRestartCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = botRestartCommand19.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand19.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test185"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = nodeAdminCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = nodeAdminCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = nodeAdminCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = nodeAdminCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand8.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test186"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("", str_array7);
    fredboat.command.admin.ReviveCommand reviveCommand10 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test187"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array8);
    java.io.File file14 = randomImageCommand13.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file14);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test188"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("", str_array15);
    fredboat.command.util.MathCommand mathCommand23 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test189"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("hi!", str_array10);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test190"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand13 = new fredboat.command.admin.ReviveCommand("hi!", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test191"); }

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
    fredboat.command.fun.PatCommand patCommand28 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = patCommand28.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test192"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("", str_array16);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("hi!", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array16);
    fredboat.command.util.CommandsCommand commandsCommand25 = new fredboat.command.util.CommandsCommand("", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand27 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand28 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand29 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test193"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = unpauseCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test194"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("hi!", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("", "hi!", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand24 = new fredboat.command.admin.BotRestartCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test195"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("hi!", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand24 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand25 = new fredboat.command.admin.TestCommand("", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand26 = new fredboat.command.admin.ReviveCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel27 = reviveCommand26.getMinimumPerms();
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = reviveCommand26.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test196"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand14 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("", "", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test197"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand19 = new fredboat.command.fun.FacedeskCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel21 = forwardCommand20.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand20.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test198"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand22 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand24 = new fredboat.command.util.ServerInfoCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand26 = new fredboat.command.util.AvatarCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = avatarCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test199"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand25 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = botRestartCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test200"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand23 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand24 = new fredboat.command.fun.DanceCommand("hi!", str_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test201"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = nodeAdminCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = nodeAdminCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = nodeAdminCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = nodeAdminCommand19.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand19.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test202"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test203"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test204"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    remoteFileCommand9.url = "http://i.imgur.com/NqyOqnj.gif";
    java.lang.String str13 = remoteFileCommand9.url;
    remoteFileCommand9.url = "";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str13.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test205"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel9 = setAvatarCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = setAvatarCommand8.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test206"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("hi!", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = repeatCommand8.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = repeatCommand8.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test207"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test208"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = playSplitCommand16.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test209"); }

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
    fredboat.command.music.control.PlaySplitCommand playSplitCommand25 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel26 = playSplitCommand25.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand25.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test210"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand22 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array18);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand25 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand27 = new fredboat.command.maintenance.AudioDebugCommand("", str_array18);
    fredboat.command.music.control.RepeatCommand repeatCommand28 = new fredboat.command.music.control.RepeatCommand("", str_array18);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand29 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.seeking.ForwardCommand forwardCommand30 = new fredboat.command.music.seeking.ForwardCommand("", str_array18);
    fredboat.command.fun.PatCommand patCommand31 = new fredboat.command.fun.PatCommand("", "hi!", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand32 = new fredboat.command.admin.SetAvatarCommand("", str_array18);
    fredboat.messaging.internal.Context context33 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str34 = setAvatarCommand32.help(context33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test211"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand23 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.perms.PermissionLevel permissionLevel24 = testCommand23.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand23.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test212"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = nodeAdminCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = nodeAdminCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = nodeAdminCommand12.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test213"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel9 = setAvatarCommand8.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = setAvatarCommand8.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test214"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand22 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("hi!", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand25 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test215"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = configCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test216"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.SeekCommand seekCommand11 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand12 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand13 = new fredboat.command.music.control.PauseCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test217"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = joinCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = joinCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test218"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("hi!", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test219"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = evalCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = evalCommand12.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test220"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand21 = new fredboat.command.util.CommandsCommand("", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand22 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand24 = new fredboat.command.fun.RemoteFileCommand("", "", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test221"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand16 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    remoteFileCommand16.url = "";
    remoteFileCommand16.url = "";
    remoteFileCommand16.url = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand16.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test222"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand16 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = leaveCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test223"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    textCommand9.msg = "http://i.imgur.com/NqyOqnj.gif";
    textCommand9.msg = "hi!";
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = textCommand9.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test224"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array18);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.maintenance.NodesCommand nodesCommand24 = new fredboat.command.maintenance.NodesCommand("", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand25 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand26 = new fredboat.command.music.control.PlaySplitCommand("", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand27 = new fredboat.command.maintenance.AudioDebugCommand("", str_array18);
    fredboat.command.music.control.PauseCommand pauseCommand28 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.ServerInfoCommand serverInfoCommand29 = new fredboat.command.util.ServerInfoCommand("hi!", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand30 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.control.JoinCommand joinCommand31 = new fredboat.command.music.control.JoinCommand("", str_array18);
    fredboat.command.music.control.ShuffleCommand shuffleCommand32 = new fredboat.command.music.control.ShuffleCommand("", str_array18);
    fredboat.perms.PermissionLevel permissionLevel33 = shuffleCommand32.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    org.junit.Assert.assertTrue("'" + permissionLevel33 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel33.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test225"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.SeekCommand seekCommand9 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = testCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test226"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand("", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = forwardCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = forwardCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = forwardCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand10.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test227"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test228"); }

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
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("", str_array15);
    fredboat.perms.PermissionLevel permissionLevel28 = reshuffleCommand27.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test229"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array13);
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
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test230"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    java.lang.String str11 = textCommand9.msg;
    java.lang.String str12 = textCommand9.msg;
    textCommand9.msg = "";
    java.lang.String str15 = textCommand9.msg;
    java.lang.String str16 = textCommand9.msg;
    java.lang.String str17 = textCommand9.msg;
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = textCommand9.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test231"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array19);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array19);
    fredboat.command.admin.ReviveCommand reviveCommand24 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.seeking.ForwardCommand forwardCommand26 = new fredboat.command.music.seeking.ForwardCommand("", str_array19);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand27 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand28 = new fredboat.command.admin.UnblacklistCommand("", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand29 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test232"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("hi!", str_array17);
    fredboat.command.admin.BotRestartCommand botRestartCommand26 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand28 = new fredboat.command.maintenance.AudioDebugCommand("", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand29 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test233"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand19 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test234"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand13 = new fredboat.command.maintenance.GetIdCommand("", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = getIdCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test235"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = reshuffleCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test236"); }

    fredboat.util.rest.Weather weather0 = null;
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
    fredboat.command.util.WeatherCommand weatherCommand31 = new fredboat.command.util.WeatherCommand(weather0, "hi!", str_array21);
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand31.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test237"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand2 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test238"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test239"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array17);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("", str_array17);
    fredboat.command.admin.ExitCommand exitCommand24 = new fredboat.command.admin.ExitCommand("hi!", str_array17);
    fredboat.command.music.seeking.RewindCommand rewindCommand25 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand26 = new fredboat.command.admin.UpdateCommand("hi!", str_array17);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand27 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.CatgirlCommand catgirlCommand29 = new fredboat.command.fun.CatgirlCommand("hi!", str_array17);
    fredboat.command.admin.TestCommand testCommand30 = new fredboat.command.admin.TestCommand("hi!", str_array17);
    fredboat.command.util.BrainfuckCommand brainfuckCommand31 = new fredboat.command.util.BrainfuckCommand("", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext32 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand31.onInvoke(commandContext32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test240"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("hi!", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("hi!", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand23 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand25 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = unpauseCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test241"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("hi!", str_array11);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = testCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test242"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand23 = new fredboat.command.music.control.DestroyCommand("hi!", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test243"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand17 = new fredboat.command.music.control.LeaveCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand21 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("", "", str_array15);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = facedeskCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test244"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand17 = new fredboat.command.music.control.LeaveCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand21 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test245"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand24 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand26 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand27 = new fredboat.command.music.seeking.SeekCommand("", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test246"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test247"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather2, "hi!", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand20 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = restartCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test248"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = repeatCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test249"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand18 = new fredboat.command.fun.RemoteFileCommand("", "", str_array11);
    remoteFileCommand18.url = "";
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = remoteFileCommand18.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test250"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("hi!", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand22 = new fredboat.command.moderation.EnableCommandsCommand("", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array14);
    fredboat.command.admin.TestCommand testCommand24 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test251"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("", str_array17);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("", str_array17);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array17);
    fredboat.command.fun.HugCommand hugCommand23 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array17);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.RollCommand rollCommand25 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand26 = new fredboat.command.admin.UnblacklistCommand("", str_array17);
    fredboat.command.music.control.PauseCommand pauseCommand27 = new fredboat.command.music.control.PauseCommand("hi!", str_array17);
    fredboat.perms.PermissionLevel permissionLevel28 = pauseCommand27.getMinimumPerms();
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = pauseCommand27.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test252"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array17);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("", str_array17);
    fredboat.command.admin.ExitCommand exitCommand24 = new fredboat.command.admin.ExitCommand("hi!", str_array17);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array17);
    fredboat.command.util.CommandsCommand commandsCommand26 = new fredboat.command.util.CommandsCommand("", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand27 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand28 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand29 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand30 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand31 = new fredboat.command.admin.UpdateCommand("", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test253"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test254"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand22 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand23 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.PauseCommand pauseCommand25 = new fredboat.command.music.control.PauseCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel26 = pauseCommand25.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel27 = pauseCommand25.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test255"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.EvalCommand evalCommand24 = new fredboat.command.admin.EvalCommand("", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test256"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = reshuffleCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test257"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("", str_array15);
    fredboat.command.util.MathCommand mathCommand24 = new fredboat.command.util.MathCommand("", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test258"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand2 = new fredboat.command.moderation.DisableCommandsCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test259"); }

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
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test260"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test261"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = stopCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = stopCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = stopCommand12.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test262"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("hi!", str_array13);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand22 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test263"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather2, "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand20 = new fredboat.command.admin.BotRestartCommand("", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = nodeAdminCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test264"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("", str_array8);
    fredboat.command.admin.BotRestartCommand botRestartCommand12 = new fredboat.command.admin.BotRestartCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = botRestartCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = botRestartCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test265"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test266"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = pauseCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test267"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("", "", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
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
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test268"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = destroyCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = destroyCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = destroyCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand10.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test269"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test270"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array16);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array16);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand24 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand25 = new fredboat.command.music.control.UnpauseCommand("", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand26 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand27 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test271"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test272"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand11 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.HugCommand hugCommand13 = new fredboat.command.fun.HugCommand("hi!", "", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    java.io.File file15 = randomImageCommand14.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file15);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test273"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test274"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = historyCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test275"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = repeatCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = repeatCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = repeatCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand15.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test276"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("hi!", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = seekCommand15.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test277"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    java.lang.String str11 = textCommand9.msg;
    textCommand9.msg = "";
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand9.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test278"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand20 = new fredboat.command.fun.CatgirlCommand("hi!", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand22 = new fredboat.command.music.control.PauseCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.perms.PermissionLevel permissionLevel24 = disableCommandsCommand23.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand23.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test279"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand16 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.BotRestartCommand botRestartCommand20 = new fredboat.command.admin.BotRestartCommand("", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test280"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test281"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test282"); }

    java.lang.String[] str_array22 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array22);
    fredboat.command.fun.RandomImageCommand randomImageCommand24 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array22);
    fredboat.command.music.seeking.SeekCommand seekCommand25 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array22);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("", str_array22);
    fredboat.command.fun.RandomImageCommand randomImageCommand27 = new fredboat.command.fun.RandomImageCommand("", "", str_array22);
    fredboat.command.music.info.HistoryCommand historyCommand28 = new fredboat.command.music.info.HistoryCommand("", str_array22);
    fredboat.command.fun.RollCommand rollCommand29 = new fredboat.command.fun.RollCommand("", "hi!", str_array22);
    fredboat.command.admin.ReviveCommand reviveCommand30 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array22);
    fredboat.command.admin.ExitCommand exitCommand31 = new fredboat.command.admin.ExitCommand("", str_array22);
    fredboat.command.fun.PatCommand patCommand32 = new fredboat.command.fun.PatCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array22);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand33 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array22);
    fredboat.commandmeta.abs.CommandContext commandContext34 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand33.onInvoke(commandContext34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test283"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.MathCommand mathCommand24 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("hi!", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test284"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("", str_array12);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand20 = new fredboat.command.music.seeking.RestartCommand("", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = configCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = configCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = configCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel25 = configCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test285"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = pauseCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test286"); }

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
    fredboat.command.music.info.ListCommand listCommand27 = new fredboat.command.music.info.ListCommand("", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test287"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("hi!", str_array14);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand23 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.perms.PermissionLevel permissionLevel24 = testCommand23.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel25 = testCommand23.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test288"); }

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
    fredboat.command.music.seeking.RewindCommand rewindCommand30 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array20);
    fredboat.commandmeta.abs.CommandContext commandContext31 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand30.onInvoke(commandContext31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test289"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("", "", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = setAvatarCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test290"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array16);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("", str_array16);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("hi!", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array16);
    fredboat.command.util.CommandsCommand commandsCommand25 = new fredboat.command.util.CommandsCommand("", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand27 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand28 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.ServerInfoCommand serverInfoCommand29 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    java.lang.String str30 = serverInfoCommand29.name;
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = serverInfoCommand29.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str30.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test291"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.music.control.PauseCommand pauseCommand20 = new fredboat.command.music.control.PauseCommand("", str_array15);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand23 = new fredboat.command.util.WeatherCommand(weather1, "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test292"); }

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
    java.lang.String str23 = patCommand22.getRandomImageUrl();
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = patCommand22.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str23.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test293"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test294"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test295"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel23 = configCommand22.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = configCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test296"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("hi!", str_array15);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand24 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand25 = new fredboat.command.maintenance.PingCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = pingCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test297"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "hi!", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test298"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = exitCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel23 = exitCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test299"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand24 = new fredboat.command.music.control.DestroyCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand26 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test300"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test301"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand20 = new fredboat.command.maintenance.VersionCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand23 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = serverInfoCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test302"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = restartCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test303"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("", str_array13);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand21 = new fredboat.command.maintenance.VersionCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test304"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("hi!", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = playSplitCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test305"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand23 = new fredboat.command.music.control.RepeatCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand24 = new fredboat.command.music.control.RepeatCommand("", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand25 = new fredboat.command.moderation.ConfigCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test306"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.TestCommand testCommand8 = new fredboat.command.admin.TestCommand("hi!", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = testCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test307"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("", str_array16);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand27 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test308"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array12);
    java.io.File file21 = facedeskCommand20.getRandomFile();
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
    org.junit.Assert.assertNotNull(file21);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test309"); }

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
    fredboat.command.util.MathCommand mathCommand27 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext28 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand27.onInvoke(commandContext28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test310"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand22 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test311"); }

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
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand26 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = shuffleCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test312"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand20 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = facedeskCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test313"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test314"); }

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
    fredboat.perms.PermissionLevel permissionLevel22 = seekCommand21.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = seekCommand21.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test315"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("", str_array13);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand23 = new fredboat.command.fun.DanceCommand("", str_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test316"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array19);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("", str_array19);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array19);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.util.BrainfuckCommand brainfuckCommand24 = new fredboat.command.util.BrainfuckCommand("", str_array19);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand26 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand27 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand28 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand29 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand30 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.fun.RollCommand rollCommand31 = new fredboat.command.fun.RollCommand("", "", str_array19);
    fredboat.command.fun.HugCommand hugCommand32 = new fredboat.command.fun.HugCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand33 = new fredboat.command.admin.UnblacklistCommand("", str_array19);
    fredboat.perms.PermissionLevel permissionLevel34 = unblacklistCommand33.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext35 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand33.onInvoke(commandContext35);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    org.junit.Assert.assertTrue("'" + permissionLevel34 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel34.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test317"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand13 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand14 = new fredboat.command.moderation.ConfigCommand("hi!", str_array9);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = hugCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test318"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("hi!", str_array13);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand20 = new fredboat.command.music.control.LeaveCommand("hi!", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test319"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand("hi!", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = evalCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test320"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("hi!", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand10 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.command.fun.HugCommand hugCommand11 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array7);
    java.io.File file12 = hugCommand11.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file12);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test321"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand20 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("hi!", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    java.lang.String str23 = updateCommand22.name;
    fredboat.perms.PermissionLevel permissionLevel24 = updateCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str23.equals("http://i.imgur.com/NqyOqnj.gif"));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test322"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    java.lang.String str15 = facedeskCommand14.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str15.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test323"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("hi!", str_array12);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = playSplitCommand21.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = playSplitCommand21.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test324"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = brainfuckCommand15.process("http://i.imgur.com/NqyOqnj.gif", context17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test325"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("hi!", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel18 = pauseCommand17.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test326"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("", str_array16);
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test327"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.fun.CatgirlCommand catgirlCommand25 = new fredboat.command.fun.CatgirlCommand("", str_array18);
    fredboat.command.maintenance.GetIdCommand getIdCommand26 = new fredboat.command.maintenance.GetIdCommand("", str_array18);
    fredboat.command.music.control.LeaveCommand leaveCommand27 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.music.info.HistoryCommand historyCommand28 = new fredboat.command.music.info.HistoryCommand("hi!", str_array18);
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand28.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test328"); }

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
    fredboat.perms.PermissionLevel permissionLevel30 = reshuffleCommand29.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test329"); }

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
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand35 = new fredboat.command.admin.NodeAdminCommand("", str_array19);
    fredboat.commandmeta.abs.CommandContext commandContext36 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand35.onInvoke(commandContext36);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test330"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = stopCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test331"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("hi!", str_array10);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = stopCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test332"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand21 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test333"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("hi!", "", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test334"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = restartCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test335"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand23 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test336"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("", str_array13);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("hi!", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand22 = new fredboat.command.music.seeking.SeekCommand("", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = seekCommand22.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = seekCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test337"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    java.lang.String str11 = remoteFileCommand9.url;
    remoteFileCommand9.url = "http://i.imgur.com/NqyOqnj.gif";
    java.lang.String str14 = remoteFileCommand9.url;
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str14.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test338"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test339"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand17 = new fredboat.command.music.control.LeaveCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("hi!", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand24 = new fredboat.command.music.control.LeaveCommand("hi!", str_array15);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = leaveCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test340"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand20 = new fredboat.command.maintenance.VersionCommand("", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = nodeAdminCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test341"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.EvalCommand evalCommand22 = new fredboat.command.admin.EvalCommand("hi!", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand25 = new fredboat.command.admin.ReviveCommand("", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = reviveCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test342"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("hi!", str_array12);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test343"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = disableCommandsCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = disableCommandsCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand15.onInvoke(commandContext18);
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
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test344"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand20 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("hi!", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.perms.PermissionLevel permissionLevel23 = updateCommand22.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand22.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test345"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("hi!", "", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test346"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = repeatCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test347"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array18);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array18);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("hi!", "", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array18);
    fredboat.command.music.control.StopCommand stopCommand25 = new fredboat.command.music.control.StopCommand("hi!", str_array18);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand26 = new fredboat.command.admin.NodeAdminCommand("", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand27 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = gitInfoCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test348"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "", str_array10);
    textCommand16.msg = "";
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand16.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test349"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand17 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = mathCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test350"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("", str_array15);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand22 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand24 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand25 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = weatherCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test351"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
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
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test352"); }

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
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test353"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand7 = new fredboat.command.util.CommandsCommand("hi!", str_array5);
    fredboat.command.music.seeking.RewindCommand rewindCommand8 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = rewindCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test354"); }

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
    fredboat.perms.PermissionLevel permissionLevel25 = nodeAdminCommand21.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel26 = nodeAdminCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand21.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test355"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand20 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test356"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel7 = setAvatarCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = setAvatarCommand6.getMinimumPerms();
    java.lang.String str9 = setAvatarCommand6.name;
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand6.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test357"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand17 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.EvalCommand evalCommand19 = new fredboat.command.admin.EvalCommand("hi!", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand22 = new fredboat.command.util.BrainfuckCommand("hi!", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = disableCommandsCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test358"); }

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
    fredboat.command.admin.BotRestartCommand botRestartCommand22 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test359"); }

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
    fredboat.command.fun.FacedeskCommand facedeskCommand27 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand28 = new fredboat.command.fun.CatgirlCommand("hi!", str_array16);
    fredboat.command.admin.TestCommand testCommand29 = new fredboat.command.admin.TestCommand("hi!", str_array16);
    fredboat.perms.PermissionLevel permissionLevel30 = testCommand29.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel31 = testCommand29.getMinimumPerms();
    fredboat.messaging.internal.Context context32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = testCommand29.help(context32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test360"); }

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
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand31 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.music.control.JoinCommand joinCommand32 = new fredboat.command.music.control.JoinCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.command.admin.BotRestartCommand botRestartCommand33 = new fredboat.command.admin.BotRestartCommand("", str_array19);
    fredboat.command.moderation.LanguageCommand languageCommand34 = new fredboat.command.moderation.LanguageCommand("", str_array19);
    fredboat.command.music.control.PauseCommand pauseCommand35 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array19);
    fredboat.messaging.internal.Context context36 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str37 = pauseCommand35.help(context36);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test361"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.RepeatCommand repeatCommand21 = new fredboat.command.music.control.RepeatCommand("hi!", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand23 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand24 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.music.seeking.ForwardCommand forwardCommand25 = new fredboat.command.music.seeking.ForwardCommand("", str_array16);
    fredboat.command.fun.PatCommand patCommand26 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand27 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = audioDebugCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test362"); }

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
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand29 = new fredboat.command.admin.NodeAdminCommand("", str_array17);
    fredboat.commandmeta.abs.CommandContext commandContext30 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand29.onInvoke(commandContext30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test363"); }

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
    remoteFileCommand22.url = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = remoteFileCommand22.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test364"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array12);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test365"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.admin.BotRestartCommand botRestartCommand14 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = nodesCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test366"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test367"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = testCommand17.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test368"); }

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
    fredboat.command.moderation.LanguageCommand languageCommand25 = new fredboat.command.moderation.LanguageCommand("", str_array15);
    fredboat.command.admin.EvalCommand evalCommand26 = new fredboat.command.admin.EvalCommand("hi!", str_array15);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand27 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel28 = enableCommandsCommand27.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand27.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test369"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("hi!", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand26 = new fredboat.command.admin.TestCommand("", str_array15);
    fredboat.command.fun.RollCommand rollCommand27 = new fredboat.command.fun.RollCommand("", "hi!", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test370"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("hi!", str_array16);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("", str_array16);
    fredboat.command.admin.TestCommand testCommand25 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("hi!", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand27 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test371"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = configCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test372"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = testCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test373"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand13 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand15 = new fredboat.command.admin.BotRestartCommand("hi!", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = seekCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test374"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test375"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("hi!", "", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test376"); }

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
    fredboat.command.maintenance.VersionCommand versionCommand25 = new fredboat.command.maintenance.VersionCommand("", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand26 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array15);
    fredboat.command.fun.HugCommand hugCommand27 = new fredboat.command.fun.HugCommand("", "hi!", str_array15);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = hugCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test377"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = restartCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test378"); }

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
    fredboat.command.admin.ReviveCommand reviveCommand24 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand25 = new fredboat.command.music.seeking.RestartCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test379"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = catgirlCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test380"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test381"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    java.io.File file24 = randomImageCommand23.getRandomFile();
    java.lang.String str25 = randomImageCommand23.getRandomImageUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str25.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test382"); }

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
    fredboat.command.music.seeking.RewindCommand rewindCommand30 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array20);
    fredboat.perms.PermissionLevel permissionLevel31 = rewindCommand30.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test383"); }

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
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.TestCommand testCommand26 = new fredboat.command.admin.TestCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test384"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand16 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test385"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("hi!", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand22 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand23 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand24 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.LeaveCommand leaveCommand25 = new fredboat.command.music.control.LeaveCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test386"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand23 = new fredboat.command.moderation.ConfigCommand("", str_array15);
    fredboat.command.util.MathCommand mathCommand24 = new fredboat.command.util.MathCommand("", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand25 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel26 = shuffleCommand25.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test387"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("hi!", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand16 = new fredboat.command.moderation.LanguageCommand("hi!", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test388"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = testCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = testCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test389"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test390"); }

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
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand26 = new fredboat.command.admin.NodeAdminCommand("", str_array15);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = nodeAdminCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test391"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand11 = new fredboat.command.fun.CatgirlCommand("", str_array7);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = stopCommand12.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test392"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test393"); }

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
    fredboat.perms.PermissionLevel permissionLevel21 = reshuffleCommand19.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test394"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand12 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("hi!", str_array8);
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
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test395"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.util.ServerInfoCommand serverInfoCommand19 = new fredboat.command.util.ServerInfoCommand("", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("", str_array17);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array17);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("", str_array17);
    fredboat.command.admin.ExitCommand exitCommand24 = new fredboat.command.admin.ExitCommand("hi!", str_array17);
    fredboat.command.music.seeking.RewindCommand rewindCommand25 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array17);
    fredboat.command.admin.UpdateCommand updateCommand26 = new fredboat.command.admin.UpdateCommand("hi!", str_array17);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand27 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.fun.CatgirlCommand catgirlCommand29 = new fredboat.command.fun.CatgirlCommand("hi!", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand30 = new fredboat.command.music.info.HistoryCommand("", str_array17);
    fredboat.command.maintenance.GetIdCommand getIdCommand31 = new fredboat.command.maintenance.GetIdCommand("", str_array17);
    fredboat.messaging.internal.Context context32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = getIdCommand31.help(context32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test396"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.info.ListCommand listCommand23 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
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
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test397"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand9 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.fun.HugCommand hugCommand11 = new fredboat.command.fun.HugCommand("hi!", "", str_array7);
    java.util.List<java.lang.String> list_str12 = hugCommand11.aliases;
    java.lang.String str13 = hugCommand11.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand11.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str13.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test398"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = mathCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test399"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test400"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand21 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand24 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = commandsCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test401"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = enableCommandsCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = enableCommandsCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand10.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test402"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand19 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = stopCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test403"); }

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
    fredboat.command.fun.HugCommand hugCommand24 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    java.lang.String str25 = hugCommand24.getRandomImageUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str25.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test404"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.music.control.PauseCommand pauseCommand20 = new fredboat.command.music.control.PauseCommand("", str_array15);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand23 = new fredboat.command.util.WeatherCommand(weather1, "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel25 = unpauseCommand24.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test405"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand18 = new fredboat.command.music.control.RepeatCommand("hi!", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather2, "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test406"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext31 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand30.onInvoke(commandContext31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test407"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.music.control.PauseCommand pauseCommand20 = new fredboat.command.music.control.PauseCommand("", str_array15);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array15);
    fredboat.command.music.control.JoinCommand joinCommand23 = new fredboat.command.music.control.JoinCommand("hi!", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand24 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test408"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("hi!", str_array10);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test409"); }

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
    fredboat.perms.PermissionLevel permissionLevel20 = rewindCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = rewindCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand18.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test410"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand23 = new fredboat.command.maintenance.GitInfoCommand("", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = gitInfoCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test411"); }

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
    fredboat.command.maintenance.PingCommand pingCommand29 = new fredboat.command.maintenance.PingCommand("hi!", str_array17);
    fredboat.command.admin.ReviveCommand reviveCommand30 = new fredboat.command.admin.ReviveCommand("hi!", str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test412"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("hi!", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand21 = new fredboat.command.moderation.EnableCommandsCommand("", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test413"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = exitCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = exitCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test414"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("", str_array18);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("", str_array18);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand23 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array18);
    fredboat.command.maintenance.GetIdCommand getIdCommand24 = new fredboat.command.maintenance.GetIdCommand("", str_array18);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("hi!", str_array18);
    fredboat.command.music.seeking.RewindCommand rewindCommand26 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand27 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array18);
    fredboat.command.util.ServerInfoCommand serverInfoCommand28 = new fredboat.command.util.ServerInfoCommand("hi!", str_array18);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand29 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array18);
    fredboat.command.util.AvatarCommand avatarCommand30 = new fredboat.command.util.AvatarCommand("hi!", str_array18);
    fredboat.command.music.control.DestroyCommand destroyCommand31 = new fredboat.command.music.control.DestroyCommand("", str_array18);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand32 = new fredboat.command.admin.SetAvatarCommand("", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand33 = new fredboat.command.maintenance.AudioDebugCommand("", str_array18);
    fredboat.command.maintenance.GetIdCommand getIdCommand34 = new fredboat.command.maintenance.GetIdCommand("", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test415"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = nodesCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test416"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand18 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("", str_array13);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test417"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("", "", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test418"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "hi!", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test419"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand15 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test420"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test421"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.LeaveCommand leaveCommand2 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test422"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = configCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = configCommand19.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test423"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("", str_array10);
    java.lang.String str17 = exitCommand16.name;
    fredboat.perms.PermissionLevel permissionLevel18 = exitCommand16.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = exitCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = exitCommand16.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test424"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand15 = new fredboat.command.fun.CatgirlCommand("hi!", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = languageCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test425"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand22 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand23 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test426"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = patCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test427"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand21 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test428"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather3, "hi!", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand23 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test429"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = facedeskCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test430"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test431"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = unpauseCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = unpauseCommand19.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test432"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = enableCommandsCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = enableCommandsCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = enableCommandsCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = enableCommandsCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand10.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test433"); }

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
    fredboat.command.fun.RemoteFileCommand remoteFileCommand29 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand30 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.commandmeta.abs.CommandContext commandContext31 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand30.onInvoke(commandContext31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test434"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("", "", str_array14);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("", str_array14);
    fredboat.command.util.CommandsCommand commandsCommand21 = new fredboat.command.util.CommandsCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = configCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test435"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = seekCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test436"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.moderation.ConfigCommand configCommand12 = new fredboat.command.moderation.ConfigCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test437"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand14 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test438"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.SeekCommand seekCommand9 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = shuffleCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = shuffleCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = shuffleCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = shuffleCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = shuffleCommand10.help(context15);
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

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test439"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("hi!", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test440"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test441"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand19 = new fredboat.command.fun.FacedeskCommand("hi!", "", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test442"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test443"); }

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
    fredboat.command.fun.RollCommand rollCommand26 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    java.io.File file27 = rollCommand26.getRandomFile();
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = rollCommand26.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file27);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test444"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = unpauseCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = unpauseCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = unpauseCommand19.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test445"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand20 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = catgirlCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test446"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("", str_array13);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("hi!", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = listCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test447"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("hi!", str_array11);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("hi!", "", str_array11);
    java.io.File file18 = hugCommand17.getRandomFile();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = hugCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file18);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test448"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("hi!", str_array12);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.admin.BotRestartCommand botRestartCommand21 = new fredboat.command.admin.BotRestartCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test449"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("hi!", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = exitCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test450"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test451"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    remoteFileCommand9.url = "";
    remoteFileCommand9.url = "hi!";
    remoteFileCommand9.url = "";
    remoteFileCommand9.url = "";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test452"); }

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
    fredboat.command.music.seeking.RewindCommand rewindCommand30 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array20);
    fredboat.messaging.internal.Context context31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str32 = rewindCommand30.help(context31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test453"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("hi!", str_array13);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test454"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand("hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
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
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test455"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array16);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array16);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand23 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand24 = new fredboat.command.moderation.EnableCommandsCommand("", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test456"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand16 = new fredboat.command.moderation.ConfigCommand("hi!", str_array11);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand18 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand19 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test457"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand16 = new fredboat.command.fun.RemoteFileCommand("", "", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = playSplitCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test458"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand21 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand24 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel25 = reshuffleCommand24.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test459"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand13 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test460"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = textCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test461"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("hi!", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = destroyCommand17.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = destroyCommand17.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test462"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand15 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = forwardCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = forwardCommand15.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test463"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.HugCommand hugCommand13 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test464"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand22 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand23 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("", str_array15);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = seekCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test465"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand13 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test466"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array15);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand22 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand23 = new fredboat.command.fun.RemoteFileCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.CommandsCommand commandsCommand24 = new fredboat.command.util.CommandsCommand("hi!", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test467"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand22 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.perms.PermissionLevel permissionLevel23 = testCommand22.getMinimumPerms();
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = testCommand22.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test468"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand22 = new fredboat.command.music.info.HistoryCommand("hi!", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = historyCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test469"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("hi!", "", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand21 = new fredboat.command.admin.SetAvatarCommand("hi!", str_array15);
    fredboat.perms.PermissionLevel permissionLevel22 = setAvatarCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand21.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test470"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("hi!", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand21 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array14);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("hi!", "", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test471"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("hi!", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test472"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand20 = new fredboat.command.maintenance.VersionCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("hi!", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand22 = new fredboat.command.admin.ReviveCommand("", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand23 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = playSplitCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test473"); }

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
    fredboat.command.util.ServerInfoCommand serverInfoCommand29 = new fredboat.command.util.ServerInfoCommand("hi!", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test474"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand14 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = historyCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test475"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array14);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("hi!", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("hi!", str_array14);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.PatCommand patCommand23 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test476"); }

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
    fredboat.command.moderation.LanguageCommand languageCommand27 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand28 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test477"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test478"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("", str_array12);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand21 = new fredboat.command.util.CommandsCommand("", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test479"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand13 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("hi!", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test480"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand12 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("hi!", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test481"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test482"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand17 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand18 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand19 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test483"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand18 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("hi!", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather0, "", str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test484"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    java.util.List<java.lang.String> list_str21 = repeatCommand20.aliases;
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = repeatCommand20.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test485"); }

    java.lang.String[] str_array17 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand19 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array17);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array17);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array17);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("", "", str_array17);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("", str_array17);
    fredboat.command.fun.RollCommand rollCommand24 = new fredboat.command.fun.RollCommand("", "hi!", str_array17);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = rollCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test486"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand12 = new fredboat.command.music.control.PauseCommand("hi!", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand13 = new fredboat.command.moderation.ConfigCommand("", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = pauseCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test487"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test488"); }

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
    fredboat.perms.PermissionLevel permissionLevel22 = repeatCommand21.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = repeatCommand21.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test489"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("", "", str_array16);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array16);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("", str_array16);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("hi!", str_array16);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand23 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array16);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand24 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand25 = new fredboat.command.music.control.UnpauseCommand("", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand26 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand27 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.messaging.internal.Context context28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = catgirlCommand27.help(context28);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test490"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    textCommand9.msg = "";
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = textCommand9.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test491"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array15);
    fredboat.command.admin.TestCommand testCommand20 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand21 = new fredboat.command.fun.CatgirlCommand("hi!", str_array15);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("", str_array15);
    fredboat.command.music.control.PauseCommand pauseCommand23 = new fredboat.command.music.control.PauseCommand("", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand24 = new fredboat.command.maintenance.GetIdCommand("", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand25 = new fredboat.command.maintenance.GitInfoCommand("", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test492"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("", "", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test493"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array15);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("", str_array15);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("hi!", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("", str_array15);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.ExitCommand exitCommand21 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand22 = new fredboat.command.fun.RemoteFileCommand("", "", str_array15);
    fredboat.command.music.seeking.ForwardCommand forwardCommand23 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array15);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("", "hi!", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand25 = new fredboat.command.moderation.DisableCommandsCommand("", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = disableCommandsCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test494"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("hi!", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("", "", str_array12);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = listCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test495"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test496"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("hi!", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test497"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.ReviveCommand reviveCommand8 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = reviveCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test498"); }

    java.lang.String[] str_array18 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand20 = new fredboat.command.music.info.ListCommand("", str_array18);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "", str_array18);
    fredboat.command.music.control.JoinCommand joinCommand23 = new fredboat.command.music.control.JoinCommand("hi!", str_array18);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array18);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand25 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand26 = new fredboat.command.moderation.DisableCommandsCommand("", str_array18);
    fredboat.command.admin.TestCommand testCommand27 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array18);
    fredboat.command.util.MathCommand mathCommand28 = new fredboat.command.util.MathCommand("hi!", str_array18);
    fredboat.command.fun.FacedeskCommand facedeskCommand29 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array18);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand30 = new fredboat.command.moderation.DisableCommandsCommand("", str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test499"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand19 = new fredboat.command.music.control.DestroyCommand("hi!", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = pingCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test500"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand17 = new fredboat.command.maintenance.AudioDebugCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand4 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array3);
    java.lang.String str5 = unblacklistCommand4.name;
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = unblacklistCommand4.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.fun.RandomImageCommand randomImageCommand9 = new fredboat.command.fun.RandomImageCommand("", "", str_array7);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = randomImageCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    int i0 = fredboat.command.util.BrainfuckCommand.MAX_CYCLE_COUNT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10000);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = destroyCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand9 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array8);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = rollCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = nodeAdminCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand5 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array4);
    fredboat.command.util.ServerInfoCommand serverInfoCommand6 = new fredboat.command.util.ServerInfoCommand("", str_array4);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = serverInfoCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.StopCommand stopCommand11 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = stopCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.fun.RandomImageCommand randomImageCommand9 = new fredboat.command.fun.RandomImageCommand("", "", str_array7);
    java.lang.String str10 = randomImageCommand9.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand9.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str10.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand4 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand4.onInvoke(commandContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.info.ListCommand listCommand2 = new fredboat.command.music.info.ListCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.StopCommand stopCommand11 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = stopCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = stopCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = shuffleCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = shuffleCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = shuffleCommand13.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.info.HistoryCommand historyCommand2 = new fredboat.command.music.info.HistoryCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = repeatCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand4 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array3);
    java.lang.String str5 = unblacklistCommand4.name;
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand4.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = pingCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = evalCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = textCommand9.help(context11);
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = unpauseCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = updateCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.HugCommand hugCommand13 = new fredboat.command.fun.HugCommand("", "", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = patCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = remoteFileCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand14 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.music.info.HistoryCommand historyCommand8 = new fredboat.command.music.info.HistoryCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand14 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = seekCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand9 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array8);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = rollCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand17 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = shuffleCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = shuffleCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand17 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = weatherCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.fun.RandomImageCommand randomImageCommand9 = new fredboat.command.fun.RandomImageCommand("", "", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand11 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext11);
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = destroyCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.HugCommand hugCommand14 = new fredboat.command.fun.HugCommand("", "", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand15 = new fredboat.command.maintenance.PingCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.maintenance.NodesCommand nodesCommand2 = new fredboat.command.maintenance.NodesCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = setAvatarCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    java.lang.String str11 = textCommand9.msg;
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = textCommand9.help(context12);
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
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = unpauseCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = joinCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand4 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array3);
    fredboat.messaging.internal.Context context5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = unblacklistCommand4.help(context5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = disableCommandsCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand10 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = audioDebugCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.music.info.HistoryCommand historyCommand8 = new fredboat.command.music.info.HistoryCommand("", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = historyCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = textCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("", str_array6);
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
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand10 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("hi!", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = avatarCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel7 = setAvatarCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = setAvatarCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = listCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = brainfuckCommand13.process("hi!", context15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.ShuffleCommand shuffleCommand2 = new fredboat.command.music.control.ShuffleCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand5 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array4);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand6 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("", str_array6);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = avatarCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = restartCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = playSplitCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    java.lang.String str7 = setAvatarCommand6.name;
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand6.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("", str_array6);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = leaveCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand2 = new fredboat.command.fun.DanceCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = botRestartCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.StopCommand stopCommand11 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = brainfuckCommand13.process("http://i.imgur.com/NqyOqnj.gif", context15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand15 = new fredboat.command.fun.CatgirlCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.moderation.ConfigCommand configCommand11 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = configCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = unpauseCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = unpauseCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand11 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    java.lang.String str11 = remoteFileCommand9.url;
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext12);
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = nodesCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("hi!", str_array10);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = exitCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = versionCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand5 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array4);
    fredboat.command.util.ServerInfoCommand serverInfoCommand6 = new fredboat.command.util.ServerInfoCommand("", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = testCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.HugCommand hugCommand14 = new fredboat.command.fun.HugCommand("", "", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand15 = new fredboat.command.maintenance.PingCommand("", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = pingCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = serverInfoCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand11 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = setAvatarCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = nodeAdminCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = pauseCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = testCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand16 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = seekCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.EvalCommand evalCommand2 = new fredboat.command.admin.EvalCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand("", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = forwardCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = forwardCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    java.lang.String[] str_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.RandomImageCommand randomImageCommand3 = new fredboat.command.fun.RandomImageCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = rollCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = nodeAdminCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = nodeAdminCommand19.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand13 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = randomImageCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = repeatCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = destroyCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array10);
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
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    java.lang.String str11 = textCommand9.name;
    java.lang.String str12 = textCommand9.msg;
    java.lang.String str13 = textCommand9.msg;
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel15 = enableCommandsCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = enableCommandsCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.TestCommand testCommand8 = new fredboat.command.admin.TestCommand("hi!", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = testCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = testCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = hugCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand15 = new fredboat.command.maintenance.PingCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = pingCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = joinCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("", str_array6);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = listCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = disableCommandsCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand18.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand16 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = languageCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel17 = joinCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = joinCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = botRestartCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = botRestartCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand17 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("", str_array11);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("hi!", "", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand16 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = nodeAdminCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.util.BrainfuckCommand brainfuckCommand8 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = brainfuckCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = catgirlCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = evalCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext15);
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
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = rollCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("hi!", str_array10);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = exitCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = reshuffleCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.command.admin.UpdateCommand updateCommand8 = new fredboat.command.admin.UpdateCommand("hi!", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = updateCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.control.PauseCommand pauseCommand10 = new fredboat.command.music.control.PauseCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = rewindCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand10 = new fredboat.command.fun.RandomImageCommand("", "", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = testCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = destroyCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.seeking.SeekCommand seekCommand2 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = configCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "hi!", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = patCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = destroyCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = destroyCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand10 = new fredboat.command.fun.RandomImageCommand("", "", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand11 = new fredboat.command.maintenance.NodesCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = shuffleCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
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
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("", str_array5);
    fredboat.command.admin.ReviveCommand reviveCommand8 = new fredboat.command.admin.ReviveCommand("", str_array5);
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("", str_array12);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = joinCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = reshuffleCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand15 = new fredboat.command.fun.CatgirlCommand("hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("", "", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = gitInfoCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("", str_array5);
    fredboat.command.admin.ReviveCommand reviveCommand8 = new fredboat.command.admin.ReviveCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand20 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array12);
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
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand17 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = enableCommandsCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = exitCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand12 = new fredboat.command.music.control.RepeatCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = shuffleCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = disableCommandsCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = disableCommandsCommand18.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = reshuffleCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = reshuffleCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("", "hi!", str_array8);
    remoteFileCommand12.url = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand12.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("", str_array6);
    java.lang.String str9 = avatarCommand8.name;
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand13 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = playSplitCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = mathCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("hi!", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand16 = new fredboat.command.fun.DanceCommand("hi!", str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand("", str_array6);
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
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand11 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = seekCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = disableCommandsCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = destroyCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand21 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array10);
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
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand10 = new fredboat.command.fun.RandomImageCommand("", "", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel12 = testCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = testCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = nodesCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel11 = destroyCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = commandsCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
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
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = historyCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = historyCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("hi!", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = seekCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand12 = new fredboat.command.music.control.PauseCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = pauseCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = shuffleCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("", "", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = remoteFileCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand("", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = forwardCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand10 = new fredboat.command.fun.RandomImageCommand("", "", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = rewindCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array7);
    textCommand11.msg = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand11.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.admin.ReviveCommand reviveCommand10 = new fredboat.command.admin.ReviveCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = reviveCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand5 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("", str_array4);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = listCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.util.BrainfuckCommand brainfuckCommand8 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand12 = new fredboat.command.music.control.PauseCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.EvalCommand evalCommand13 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = evalCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = joinCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.control.PauseCommand pauseCommand10 = new fredboat.command.music.control.PauseCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = pauseCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel11 = restartCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = restartCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = restartCommand10.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = evalCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array7);
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
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel15 = enableCommandsCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = enableCommandsCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = enableCommandsCommand14.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = forwardCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    java.lang.String str7 = setAvatarCommand6.name;
    fredboat.perms.PermissionLevel permissionLevel8 = setAvatarCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand6.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = playSplitCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = playSplitCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("hi!", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = getIdCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    java.lang.String str16 = hugCommand15.getRandomImageUrl();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = hugCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str16.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = unpauseCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = unpauseCommand19.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array7);
    textCommand11.msg = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = textCommand11.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("hi!", str_array10);
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
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("", str_array8);
    fredboat.command.fun.PatCommand patCommand11 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array8);
    java.lang.String str12 = patCommand11.getRandomImageUrl();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = patCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str12.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array13);
    java.lang.String str18 = facedeskCommand17.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str18.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("", str_array6);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("hi!", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = updateCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel7 = setAvatarCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = setAvatarCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand6.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = mathCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = leaveCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "", str_array14);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array14);
    fredboat.command.util.AvatarCommand avatarCommand20 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand22 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
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
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = audioDebugCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand10 = new fredboat.command.fun.CatgirlCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("", "", str_array13);
    textCommand22.msg = "hi!";
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = textCommand22.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel18 = disableCommandsCommand17.getMinimumPerms();
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
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand20 = new fredboat.command.music.info.HistoryCommand("", str_array14);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = historyCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array9);
    java.lang.String str16 = rollCommand15.name;
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand15.onInvoke(commandContext17);
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
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.fun.RandomImageCommand randomImageCommand9 = new fredboat.command.fun.RandomImageCommand("", "", str_array7);
    java.lang.String str10 = randomImageCommand9.getRandomImageUrl();
    java.lang.String str11 = randomImageCommand9.name;
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand9.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str10.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    java.lang.String str11 = remoteFileCommand9.url;
    remoteFileCommand9.url = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = remoteFileCommand9.help(context14);
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
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand12 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = stopCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("", "hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array11);
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
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.BotRestartCommand botRestartCommand2 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.seeking.RestartCommand restartCommand2 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = hugCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel17 = joinCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.HugCommand hugCommand14 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    java.lang.String str11 = remoteFileCommand9.url;
    remoteFileCommand9.url = "http://i.imgur.com/NqyOqnj.gif";
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext14);
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
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand18 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand11 = new fredboat.command.fun.CatgirlCommand("", str_array7);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("hi!", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
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
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = getIdCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand8 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.SeekCommand seekCommand9 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand10 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = updateCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand21 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = evalCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = evalCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = evalCommand12.help(context16);
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand("", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("hi!", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = remoteFileCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand7 = new fredboat.command.admin.SetAvatarCommand("", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand8 = new fredboat.command.util.BrainfuckCommand("", str_array6);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = brainfuckCommand8.process("", context10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand13 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand12 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand13 = new fredboat.command.fun.DanceCommand("hi!", str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.TestCommand testCommand14 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = serverInfoCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.command.music.seeking.SeekCommand seekCommand8 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = seekCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand5 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel11 = unpauseCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = unpauseCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.moderation.ConfigCommand configCommand11 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = historyCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand("", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = versionCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand12 = new fredboat.command.util.CommandsCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.BotRestartCommand botRestartCommand2 = new fredboat.command.admin.BotRestartCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand13 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("hi!", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand15 = new fredboat.command.fun.DanceCommand("", str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand12 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = disableCommandsCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
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
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = brainfuckCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = unblacklistCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = playSplitCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = playSplitCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand15.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand12 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand("", str_array7);
    fredboat.command.admin.BotRestartCommand botRestartCommand12 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = botRestartCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = botRestartCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = botRestartCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = botRestartCommand10.help(context13);
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
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("hi!", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = exitCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = playSplitCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand10 = new fredboat.command.fun.CatgirlCommand("", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = catgirlCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("", str_array9);
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
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.util.AvatarCommand avatarCommand2 = new fredboat.command.util.AvatarCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("", str_array8);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand("", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = mathCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("hi!", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = mathCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand12 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = audioDebugCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand10 = new fredboat.command.fun.RandomImageCommand("", "", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand11 = new fredboat.command.maintenance.NodesCommand("", str_array8);
    java.lang.String str12 = nodesCommand11.name;
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = nodesCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = configCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = forwardCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = forwardCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("hi!", str_array10);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel17 = exitCommand16.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = exitCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand16.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel16 = pauseCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = pauseCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
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
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = shuffleCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = shuffleCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = shuffleCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand13.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand14 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = restartCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand10 = new fredboat.command.fun.RandomImageCommand("", "", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = enableCommandsCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = brainfuckCommand18.process("http://i.imgur.com/NqyOqnj.gif", context20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array11);
    fredboat.perms.PermissionLevel permissionLevel21 = disableCommandsCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand14 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
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
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array10);
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
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel18 = shuffleCommand17.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand9 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = gitInfoCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = forwardCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand21 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = serverInfoCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = playSplitCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand21.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel20 = nodeAdminCommand19.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.ShuffleCommand shuffleCommand2 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("", str_array9);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = nodeAdminCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = unpauseCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = configCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel18 = configCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = configCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = reshuffleCommand10.getMinimumPerms();
    java.lang.String str12 = reshuffleCommand10.name;
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = reshuffleCommand10.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str12.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array15);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array15);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("", "", str_array15);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("", str_array15);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = historyCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("hi!", str_array7);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("", str_array10);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.perms.PermissionLevel permissionLevel16 = nodeAdminCommand15.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = unblacklistCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel18 = configCommand17.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
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
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = brainfuckCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    java.lang.String str16 = hugCommand15.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str16.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = avatarCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

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
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = unpauseCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand13 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand18 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = audioDebugCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = brainfuckCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = patCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
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
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand9 = new fredboat.command.admin.TestCommand("hi!", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = destroyCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = destroyCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand13 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = playSplitCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand18 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = remoteFileCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand14 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("", str_array15);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array15);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand22 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand23 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = facedeskCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand12 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand18 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = forwardCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array9);
    java.lang.String str16 = rollCommand15.name;
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = rollCommand15.help(context17);
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
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("hi!", str_array10);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("", str_array11);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = unblacklistCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    java.util.List<java.lang.String> list_str18 = reshuffleCommand17.aliases;
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = reshuffleCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.ShuffleCommand shuffleCommand2 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array16);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array16);
    fredboat.command.music.control.UnpauseCommand unpauseCommand23 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand24 = new fredboat.command.fun.FacedeskCommand("hi!", "http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.AvatarCommand avatarCommand25 = new fredboat.command.util.AvatarCommand("hi!", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.fun.RandomImageCommand randomImageCommand9 = new fredboat.command.fun.RandomImageCommand("", "", str_array7);
    java.lang.String str10 = randomImageCommand9.getRandomImageUrl();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = randomImageCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str10.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = gitInfoCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("hi!", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand7 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = serverInfoCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand18 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = reviveCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.admin.ReviveCommand reviveCommand10 = new fredboat.command.admin.ReviveCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand12 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.maintenance.GetIdCommand getIdCommand2 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("hi!", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("", str_array13);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("hi!", "", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel13 = testCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = testCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = brainfuckCommand18.process("", context20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = rewindCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = rewindCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = rewindCommand11.help(context14);
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
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand11 = new fredboat.command.fun.RandomImageCommand("", "", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand13 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = getIdCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("", str_array12);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array12);
    fredboat.command.admin.ReviveCommand reviveCommand18 = new fredboat.command.admin.ReviveCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = patCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = rollCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("hi!", "hi!", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("", str_array8);
    fredboat.command.fun.PatCommand patCommand11 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = reviveCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("", str_array11);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = commandsCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = avatarCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("", str_array11);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array11);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = facedeskCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand13 = new fredboat.command.music.info.HistoryCommand("", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("hi!", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = pingCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("hi!", str_array13);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand21 = new fredboat.command.maintenance.VersionCommand("", str_array13);
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
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.HugCommand hugCommand17 = new fredboat.command.fun.HugCommand("", "", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array13);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("hi!", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand21 = new fredboat.command.fun.FacedeskCommand("", "hi!", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = avatarCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.maintenance.GetIdCommand getIdCommand2 = new fredboat.command.maintenance.GetIdCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("hi!", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array10);
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
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand10 = new fredboat.command.fun.RandomImageCommand("", "", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand11 = new fredboat.command.maintenance.NodesCommand("", str_array8);
    java.lang.String str12 = nodesCommand11.name;
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand6 = new fredboat.command.admin.SetAvatarCommand("", str_array5);
    java.lang.String str7 = setAvatarCommand6.name;
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = setAvatarCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand2 = new fredboat.command.music.control.ReshuffleCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand12 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = reshuffleCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand17 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather0, "http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = unpauseCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand6 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.command.music.seeking.SeekCommand seekCommand8 = new fredboat.command.music.seeking.SeekCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = seekCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand13 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = commandsCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = rewindCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = rewindCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("", "", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("hi!", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("hi!", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand12 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = playSplitCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand2 = new fredboat.command.music.control.ReshuffleCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("", str_array8);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand13 = new fredboat.command.fun.DanceCommand("hi!", str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
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
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.HugCommand hugCommand14 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = hugCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.info.ListCommand listCommand2 = new fredboat.command.music.info.ListCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("hi!", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand24 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = forwardCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand12 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand17 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = enableCommandsCommand19.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = enableCommandsCommand19.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand19.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand5 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array4);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand6 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = reshuffleCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = reshuffleCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand14 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("hi!", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand18 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = avatarCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

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
    fredboat.command.music.control.PauseCommand pauseCommand25 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand26.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.seeking.RewindCommand rewindCommand2 = new fredboat.command.music.seeking.RewindCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand15 = new fredboat.command.admin.BotRestartCommand("", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = botRestartCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("", "", str_array11);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array11);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = catgirlCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array10);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    java.lang.String str16 = hugCommand15.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str16.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("hi!", "hi!", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = hugCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand12 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("", "", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = nodeAdminCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand12.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = disableCommandsCommand18.getMinimumPerms();
    java.lang.String str22 = disableCommandsCommand18.name;
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = disableCommandsCommand18.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    remoteFileCommand9.url = "";
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = remoteFileCommand9.help(context13);
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
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand13 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = historyCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("", "", str_array8);
    remoteFileCommand13.url = "";
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = remoteFileCommand13.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    java.lang.String str15 = facedeskCommand14.getRandomImageUrl();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = facedeskCommand14.help(context16);
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
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.TestCommand testCommand11 = new fredboat.command.admin.TestCommand("", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = serverInfoCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array13);
    fredboat.command.music.seeking.SeekCommand seekCommand16 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.HugCommand hugCommand13 = new fredboat.command.fun.HugCommand("", "", str_array9);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = hugCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("", str_array7);
    fredboat.command.music.info.HistoryCommand historyCommand10 = new fredboat.command.music.info.HistoryCommand("", str_array7);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = nodeAdminCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = nodeAdminCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("", str_array6);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand12 = new fredboat.command.moderation.ConfigCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand13 = new fredboat.command.music.control.RepeatCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = repeatCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand22 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand23 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand24 = new fredboat.command.maintenance.GitInfoCommand("", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
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
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("", str_array9);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.perms.PermissionLevel permissionLevel14 = restartCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array6);
    java.lang.String str10 = textCommand9.msg;
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand9.onInvoke(commandContext11);
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
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("", "", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("", str_array12);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("", str_array12);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = mathCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.TestCommand testCommand12 = new fredboat.command.admin.TestCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = testCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array12);
    fredboat.command.music.control.StopCommand stopCommand16 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand20 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = audioDebugCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand12 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.EvalCommand evalCommand14 = new fredboat.command.admin.EvalCommand("hi!", str_array9);
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
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = commandsCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand20 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("", str_array14);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand23 = new fredboat.command.maintenance.AudioDebugCommand("", str_array14);
    fredboat.command.music.control.PauseCommand pauseCommand24 = new fredboat.command.music.control.PauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.perms.PermissionLevel permissionLevel25 = pauseCommand24.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel26 = pauseCommand24.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand24.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

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
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = textCommand9.help(context17);
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

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = repeatCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = repeatCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.music.control.StopCommand stopCommand15 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("hi!", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand17 = new fredboat.command.maintenance.AudioDebugCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand14 = new fredboat.command.music.control.DestroyCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("", "", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = avatarCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand21 = new fredboat.command.music.control.ReshuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand22 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand23 = new fredboat.command.maintenance.GitInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
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
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array13);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("hi!", str_array13);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand10 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand12 = new fredboat.command.music.info.HistoryCommand("", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand13 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = exitCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "hi!", "hi!", "hi!", "", "http://i.imgur.com/NqyOqnj.gif" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("hi!", str_array12);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("hi!", "hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("hi!", str_array11);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("hi!", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel21 = disableCommandsCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel22 = disableCommandsCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand18.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

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
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = nodeAdminCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("", str_array6);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand9 = new fredboat.command.admin.UnblacklistCommand("", str_array6);
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
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.UnblacklistCommand unblacklistCommand8 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("hi!", "hi!", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = rewindCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = rewindCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand11.onInvoke(commandContext14);
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
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "", "hi!", "hi!" };
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("", str_array13);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("", str_array13);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("http://i.imgur.com/NqyOqnj.gif", "hi!", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("hi!", "", str_array13);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = remoteFileCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

}

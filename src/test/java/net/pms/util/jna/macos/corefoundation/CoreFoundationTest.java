package net.pms.util.jna.macos.corefoundation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import com.sun.jna.Platform;
import net.pms.util.jna.macos.corefoundation.CoreFoundation.CFStringRef;
import net.pms.util.jna.macos.kernreturn.DefaultKernReturnT.DefaultSubsystem;
import net.pms.util.jna.macos.kernreturn.IOReturn.IOReturnSubsystem;

public class CoreFoundationTest {
	private static CoreFoundation CF;

	@BeforeClass
	public static void SetUp() {
		Assume.assumeTrue(Platform.isMac());
		CF = CoreFoundation.INSTANCE;
	}

	@Test
	public void testCFString() throws Throwable {
		assertEquals("FooBar", CFStringRef.toCFStringRef("FooBar").toString());
		assertNull(CFStringRef.toCFStringRef(null).toString());

	}


}

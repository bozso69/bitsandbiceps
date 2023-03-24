package suits;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;


/**
 * Warm-up teszt készlet.
 * 
 * Lefuttatja a "tests" package-ben található minden olyan tesztet, 
 * amelyik "Warm-up" tag-gel van ellátva.
 * 
 *
 */
@Suite
@SuiteDisplayName("Zoltan test suite")
@SelectPackages("tests")
@IncludeTags("ZoltanTest")
public class ZoltanSuite2 {

}

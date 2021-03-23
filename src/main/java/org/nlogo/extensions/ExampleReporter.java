package org.nlogo.extensions;

import org.nlogo.api.*;
import org.nlogo.core.LogoList;
import org.nlogo.core.Syntax;
import scala.collection.immutable.List$;

public final class ExampleReporter implements Reporter {

    @Override
    public Object report(Argument[] args, Context context) throws ExtensionException {

        final LogoList someList = args[0].getList();
        final String someString = args[1].getString();
        final int someInt = args[2].getIntValue();

        return ScalaConversions.toLogoObject(someList);
    }

    @Override
    public Syntax getSyntax() {
        return Syntax.reporterSyntax(
                Syntax.reporterSyntax$default$1(),
                Syntax.reporterSyntax$default$2(),
                // arg types
                List$.MODULE$.newBuilder()
                        .$plus$eq(Syntax.ListType())
                        .$plus$eq(Syntax.StringType())
                        .$plus$eq(Syntax.NumberType())
                        .result(),
                // return (report) type
                Syntax.ListType(),
                Syntax.reporterSyntax$default$5(),
                Syntax.reporterSyntax$default$6(),
                Syntax.reporterSyntax$default$7(),
                Syntax.reporterSyntax$default$8(),
                Syntax.reporterSyntax$default$9());
    }
}

package org.nlogo.extensions;

import org.nlogo.api.DefaultClassManager;
import org.nlogo.api.PrimitiveManager;

public final class Manager extends DefaultClassManager {
    @Override
    public void load(PrimitiveManager primManager) {
        primManager.addPrimitive("some-reporter", new ExampleReporter());
    }
}

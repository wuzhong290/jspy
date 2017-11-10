package com.zhyea.jspy.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class JSpyTransformer implements ClassFileTransformer {

    private String option;

    private Instrumentation instrumentation;

    public JSpyTransformer(String option, Instrumentation ins) {
        this.option = option;
        this.instrumentation = ins;
    }


    @Override
    public byte[] transform(ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        return new byte[0];
    }
}

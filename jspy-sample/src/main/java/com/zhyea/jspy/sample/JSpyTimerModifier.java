package com.zhyea.jspy.sample;

import com.zhyea.jspy.agent.asm.TimerClassAdapter;
import com.zhyea.jspy.sample.model.TestModel;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Type;

import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.ClassReader.EXPAND_FRAMES;


/**
 * 测试类，用于验证Timer AOP的效果
 */
public class JSpyTimerModifier {


    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader(Type.getInternalName(TestModel.class));
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);

        TimerClassAdapter tca = new TimerClassAdapter(cw);
        cr.accept(tca, EXPAND_FRAMES);

        byte[] bytes = cw.toByteArray();
        FileOutputStream fw = new FileOutputStream("/test/Account.class");
        fw.write(bytes);
    }

}

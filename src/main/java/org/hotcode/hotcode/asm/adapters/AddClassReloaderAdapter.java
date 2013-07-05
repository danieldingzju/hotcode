package org.hotcode.hotcode.asm.adapters;

import org.hotcode.hotcode.ClassReloader;
import org.hotcode.hotcode.constants.HotCodeConstant;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Add {@link org.hotcode.hotcode.ClassReloader} to the class.
 * 
 * @author hotcode.huangt 13-6-26 AM9:59
 */
public class AddClassReloaderAdapter extends ClassVisitor {

    public AddClassReloaderAdapter(ClassVisitor cv){
        super(Opcodes.ASM4, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        // if (!Modifier.isInterface(access)) {
        cv.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, HotCodeConstant.HOTCODE_CLASS_RELOADER_FIELDS,
                      Type.getDescriptor(ClassReloader.class), null, null);
        // }
        super.visit(version, access, name, signature, superName, interfaces);
    }
}

package org.hotcode.hotcode.adapters;

import java.lang.reflect.Modifier;

import org.hotcode.hotcode.constants.HotCodeConstant;
import org.hotcode.hotcode.structure.FieldsHolder;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Adapter that add field holders to the class.
 * 
 * @author khotyn 2013-06-24 20:21:57
 */
public class AddFieldsHolderAdapter extends ClassVisitor {

    public AddFieldsHolderAdapter(ClassVisitor cv){
        super(Opcodes.ASM4, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {

        cv.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, HotCodeConstant.HOTCODE_STATIC_FIELDS,
                      Type.getDescriptor(FieldsHolder.class), null, null);

        // Interfaces don't have any instances field.
        if (!Modifier.isInterface(access)) {
            cv.visitField(Opcodes.ACC_PUBLIC, HotCodeConstant.HOTCODE_INSTANCE_FIELDS,
                          Type.getDescriptor(FieldsHolder.class), null, null);
        }

        super.visit(version, access, name, signature, superName, interfaces);
    }
}

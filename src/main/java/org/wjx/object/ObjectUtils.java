package org.wjx.object;


import org.wjx.annotation.AllowNull;
import org.wjx.exception.NullValueExecption;
import org.wjx.string.StringUtils;

import java.lang.reflect.Field;

public class ObjectUtils {

    public static void checkNotNull(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            //获得私有的成员属性
            Field[] fields = clazz.getDeclaredFields();
            if (fields != null && fields.length > 0) {
                for (Field field : fields) {
                    field.setAccessible(true);
                    //判断AllowNull注解是否存在
                    if (field.isAnnotationPresent(AllowNull.class)) {
                        continue;
                    } else {
                        if (field.get(obj) == null || StringUtils.isEmpty(String.valueOf(field.get(obj)))) {
                            throw new NullValueExecption("类[" + clazz.getName() + "] 字段 [ " + field.getName() + " ] 不能为空");
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

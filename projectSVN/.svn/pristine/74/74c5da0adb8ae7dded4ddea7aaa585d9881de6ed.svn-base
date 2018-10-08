package com.zacx.core.util;

import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseRTException;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Map;

/**
 * @author Liang,Jun
 * @date 2018年5月7日09:55:56
 */
public class BaseAssert {
    protected static Class exceptionClass = BaseRTException.class;

    private static BaseRTException newRTException(Object ... args) {
        Class[] argClassArr = new Class[args.length];
        for (int i=0; i<args.length; i++) {
            argClassArr[i] = args[i].getClass();
        }

        BaseRTException rtException = null;
        Constructor constructor = null;
        try {
            constructor = exceptionClass.getDeclaredConstructor(argClassArr);
        } catch (NoSuchMethodException e) {
            Class superClass = exceptionClass.getSuperclass();
            if (superClass != null) {
                try {
                    constructor = superClass.getDeclaredConstructor(argClassArr);
                } catch (NoSuchMethodException e1) {
                    throw new RuntimeException(e1);
                }
            } else {
                throw new RuntimeException(e);
            }
        }

        try {
            constructor.setAccessible(true);
            rtException = (BaseRTException)constructor.newInstance(args);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return rtException;
    }

    public static void isTrue(boolean expression) {
        isTrue(expression, Code.ERROR_UNKNOWN);
    }

    public static void isTrue(boolean expression, Code code) {
        if (!expression) {
            throw newRTException(code, code.getDescription());
        }
    }

    public static void isTrue(boolean expression, Code code, String message) {
        if (!expression) {
            throw newRTException(code, message);
        }
    }

    public static void isNull(Object object) {
        isNull(object, Code.ERROR_UNKNOWN);
    }

    public static void isNull(Object object, Code code) {
        if (object != null) {
            throw newRTException(code, code.getDescription());
        }
    }

    public static void isNull(Object object, Code code, String message) {
        if (object != null) {
            throw newRTException(code, message);
        }
    }

    public static void notNull(Object object) {
        notNull(object, Code.ERROR_UNKNOWN);
    }

    public static void notNull(Object object, Code code) {
        if (object == null) {
            throw newRTException(code, code.getDescription());
        }
    }

    public static void notNull(Object object, Code code, String message) {
        if (object == null) {
            throw newRTException(code, message);
        }
    }

    public static void hasText(String text) {
        hasText(text, Code.ERROR_UNKNOWN);
    }

    public static void hasText(String text, Code code) {
        if (!StringUtils.hasText(text)) {
            throw newRTException(code, code.getDescription());
        }
    }

    public static void hasText(String text, Code code, String message) {
        if (!StringUtils.hasText(text)) {
            throw newRTException(code, message);
        }
    }

    public static void notEmpty(Object[] array) {
        notEmpty(array, Code.ERROR_UNKNOWN);
    }

    public static void notEmpty(Object[] array, Code code) {
        if (ObjectUtils.isEmpty(array)) {
            throw newRTException(code, code.getDescription());
        }
    }

    public static void notEmpty(Object[] array, Code code, String message) {
        if (ObjectUtils.isEmpty(array)) {
            throw newRTException(code, message);
        }
    }

    public static void notEmpty(Collection collection) {
        notEmpty(collection, Code.ERROR_UNKNOWN);
    }

    public static void notEmpty(Collection collection, Code code) {
        if (CollectionUtils.isEmpty(collection)) {
            throw newRTException(code, code.getDescription());
        }
    }

    public static void notEmpty(Collection collection, Code code, String message) {
        if (CollectionUtils.isEmpty(collection)) {
            throw newRTException(code, message);
        }
    }

    public static void notEmpty(Map map) {
        notEmpty(map, Code.ERROR_UNKNOWN);
    }

    public static void notEmpty(Map map, Code code) {
        if (CollectionUtils.isEmpty(map)) {
            throw newRTException(code, code.getDescription());
        }
    }

    public static void notEmpty(Map map, Code code, String message) {
        if (CollectionUtils.isEmpty(map)) {
            throw newRTException(code, message);
        }
    }
}

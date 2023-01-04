package cn.com.zlo.common.enums;

/**
 * @author : zhangLong
 * @description:
 * @date 2023/1/4 14:50
 */
public enum StateEnum {
    /**
     * 启用
     */
    ENABLE(0),
    /**
     * 禁用
     */
    DISABLE(1);

    private final int value;

    StateEnum(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}

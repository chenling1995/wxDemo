/**
 *
 */
package com.zcsj.wx.constant;

/**
 * @author chensf
 * @ClassName: ExceptionConstants
 * @date 2017年12月11日 下午5:15:42
 * @Description: 异常错误代码常量类
 */
public final class ExceptionConstants {
    private ExceptionConstants() {
    }


    // 未知异常
    public static final String UNKNOW_EXCEPTION = "99999";

    // 系统公共异常
    // 参数解析异常
    public static final String PARAMETER_PARSING_EXCEPTION = "10010";
    //参数为空
    public static final String PARAMETER_EMPTY_EXCEPTION = "10020";
}

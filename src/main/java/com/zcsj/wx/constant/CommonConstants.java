/**
 *
 */
package com.zcsj.wx.constant;

/**
 * @author chensf
 * @ClassName: CommonConstants
 * @date 2017年12月7日 下午3:19:28
 * @Description: 统一常量定义
 */
public final class CommonConstants {
    private CommonConstants() {
    }

    // 公共常量部分
    //数据权限系统编码
    public final static String PERMISSION_CODE = "001";

    //jwt过期时间 毫秒值
    //public final static long JWT_INFO_EXPIRESSECOND = 1728000;
    public final static long JWT_INFO_EXPIRESSECOND = 172800000;
    //public final static long JWT_INFO_EXPIRESSECOND = 2000;
    //秘钥
    public final static String JWT_INFO_BASE64SECRET = "xxxxxx";

    /**
     * 成功结果码
     * 成功
     * 主要是数据库成功
     */

    public final static String SUCCESS = "10001";

    /**
     * 失败结果码
     * 失败
     * 主要是数据失败
     */
    public final static String ERROR = "10000";

    /**
     * 服务不可用
     */
    public final static String SERVICE_DISABLED = "10002";
    
    /**
     * 参数错误 
     */
    public final static String PARAMETER_ERROR = "10003";
    
    /**
     *  超时错误
     */
    public final static String TIMEW_OUT = "10004";
    
    /**
     *  数据解析错误
     */
    public final static String PARSING_ERROR = "10005";
    
    /**
     *  签名不合法
     */
    public final static String UNSIGNED_SIGNATURE = "10006";
    
    /**
     *  序列化失败
     */
    public final static String IllegalArgument_Exception = "10007";

    /**
     * 为真的字符串
     */
    public final static String TRUESTR = "true";

    /**
     * 为假的字符串
     */
    public final static String FALSESTR = "false";
    /**
     * 文件不存在
     */
    public final static String FILE_NOT_EXISTS = "10008";
}

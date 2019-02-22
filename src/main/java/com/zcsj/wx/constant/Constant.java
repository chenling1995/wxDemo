package com.zcsj.wx.constant;

/**
 * 常量类
 */
public class Constant {

	// JWT过期时间 毫秒值
	public final static long JWT_INFO_EXPIRESSECOND = 172800000;

	// redis频道 系统频道
	public static final String RODLAVER_CHANNEL_MAIN = "RODLAVER_CHANNEL_MAIN";

	// 秘钥
	public final static String JWT_INFO_BASE64SECRET = "DUCETECHY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY=";

	public final static String API_WEB = "/api/web/";
	public final static String API_WX = "/api/wx/";
	
	public final static String WX_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/get";
	
	public final static String REQUEST_GET = "GET";
	
	public final static String REQUEST_POST = "PSOT";
	
	//是
	public final static String PUB_YES = "1";
	//否
	public final static String PUB_NO = "0";

	//PC端菜单
	public final static String MENU_CLASSIFY_PC = "1";
	//移动端菜单
	public final static String MENU_CLASSIFY_APP = "2";
	
	//文件归属资源
	//文件归属资源：题目
	public final static String FILE_ATTACH_QUESTION = "1";
	//文件归属资源：资料，表明为视频资料的转码文件
	public final static String FILE_ATTACH_MATERIALS = "2";
	
	//文件类型
	//文件类型：图片
	public final static String FILE_TYPE_IMAGE = "1";
	//文件类型：文档
	public final static String FILE_TYPE_DOCUMENT = "2";
	//文件类型：视频
	public final static String FILE_TYPE_VIDEO = "3";
	
	
	//文件归属类型
	//文件归属类型：题目
	public final static String FILE_ATTACH_TYPE_QUESTION = "1";
	//文件归属类型：选项
	public final static String FILE_ATTACH_TYPE_OPTION = "2";
	
	//题目类型
	//单选题
	public final static String  SINGLE_TOPIC_SELECTION = "1";
	//多选题
	public final static String  MULTIPLE_CHOICE = "2";
	//判断题
	public final static String  TRUE_OR_FALSE = "3";
	//问答题
	public final static String  ESSAY_QUESTION = "4";

	//题目图片RedisKey键
	public final static String FILE_REDIS_KEY = "file_attch";
	
	//培训状态
	//未发布
	public final static String  TRAIN_NOT_RELEASE = "1";
	//培训中
	public final static String  TRAIN_PUBLISHED = "2";
	//已完成
	public final static String  TRAIN_COMPLETED = "3";
	
	//考试合格率参考值
	public final static int EXAMINATION_PAPER_REFERENCE = 80;

	//视频转码相关的常量
	public final static String VIDEO_TRANF_NOT_START = "0";//视频转码未开始
	public final static String VIDEO_TRANF_PEDDING = "1";//视频转码中
	public final static String VIDEO_TRANF_FINISHED = "2";//视频转码完成
	public final static String VIDEO_TRANF_ERROR = "3";//视频转码失败
}

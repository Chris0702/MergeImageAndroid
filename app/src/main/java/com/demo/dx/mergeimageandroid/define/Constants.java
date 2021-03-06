package com.demo.dx.mergeimageandroid.define;

/**
 * Created by Chris.Wu on 2016/10/21.
 */
public class Constants {
//    public static final String SERVER_URL = "http://172.16.12.122:3000";
        public static final String SERVER_URL = "http://192.168.0.11:3000";
//    public static String SERVER_URL = "http://172.18.2.42:81";
//public static final String SERVER_URL = "http://172.18.2.42:3000";
//public static final String SERVER_URL = "http://54.249.42.33:81";


    public static final boolean PUSH_MESSAGE = true;
    public static boolean SHOW_PUSH_MESSAGE_DIALOG = true;
    public static final String BODY_PUSH_MESSAGE = "body";
    public static final String TITLE_PUSH_MESSAGE = "title";
    public static final String DIALOG_TITLE_MESSAGE = "dialogTitle";
    public static final String DESCRIPTION_PUSH_MESSAGE = "description";

    //socket
    public static final String SOCKET_PATH = "/WADashboard/socket.io";
    public static final String ACTION_LOG_NSP = "/actionlog";
    public static final String ALARM_LOG_NSP = "/alarmlog";
    public static final String ALARM_SUMMARY_LOG_NSP = "/alarmSummary";
    public static final String DATA_NSP = "/data";
    public static final String NODE_STATUS_NSP = "/nodeStatus";
    public static final String SYSTEM_DATA_NSP = "/systemData";
    public static final String SOCKET_SUBSCRIBE_EVENT = "subscribe";
    public static final String SOCKET_STREAM_EVENT = "stream";
    public static final String SOCKET_AUTHENTICATION_EVENT = "authentication";
    public static final String SOCKET_AUTHENTICATED_EVENT = "authenticated";

    //web url
    public static final String HOME_WEB_URL = "file:///android_asset/views/home.html";
    public static final String INTRODUCTION_WEB_URL = "file:///android_asset/views/introduction.html";
    public static final String UPLOAD_WEB_URL = "file:///android_asset/views/uploadMergeImage.html";
    public static final String ABOUT_WEB_URL = "file:///android_asset/views/about.html";
    public static final String MERGE_IMAGE_WEB_URL = "file:///android_asset/views/mergeImage.html";

    //javascript
    public static final String ANDROID_PARAMETER_FOR_JAVASCRIPT = "appJsInterface";
    public static final String JAVASCRIPT_PARAMETER_FOR_ANDROID = "jsAppInterface";

    public static final String SET_MERGE_IMAGE_ALL_JAVASCRIPT = "setMergeImageAll";
    public static final String SET_MERGE_IMAGE_RESULT_JAVASCRIPT = "setMergeImageResult";


    public static final String INSERT_IP_HISTORY_LIST_JAVASCRIPT = "insertIpHistoryList";
    public static final String INSERT_ACCOUNT_HISTORY_LIST_JAVASCRIPT = "insertAccountHistoryList";
    public static final String INSERT_PROJECT_LIST_JAVASCRIPT = "insertProjectList";
    public static final String INSERT_FUNCTION_LIST_JAVASCRIPT = "insertFunctionList";
    public static final String INSERT_ALARM_SUMMARY_JAVASCRIPT = "insertAlarmSummary";
    public static final String CB_ACCOUNT_LOGIN_JAVASCRIPT = "cbAccountLogin";
    public static final String INSERT_NODE_LIST_JAVASCRIPT = "insertNodeList";
    public static final String INSERT_R_TREND_ID_JAVASCRIPT = "insertRTrendId";
    public static final String INSERT_R_TREND_CONFIG_JAVASCRIPT = "insertRTrendConfig";
    public static final String INSERT_ALARM_LOG_JAVASCRIPT = "insertAlarmLog";
    public static final String INSERT_ACTION_LOG_JAVASCRIPT = "insertActionLog";
    public static final String INSERT_REAL_TIME_TAG_VALUES_JAVASCRIPT = "insertRealTimeTagValues";
    public static final String INSERT_NODE_STATUS_JAVASCRIPT = "insertNodeStatus";
    public static final String ALARM_ACK_STATUS_JAVASCRIPT = "alarmAckStatus";
    public static final String ALARM_ACK_ALL_STATUS_JAVASCRIPT = "alarmAckAllStatus";
    public static final String INSERT_TAGS_LIST_JAVASCRIPT = "insertTagsList";
    public static final String INSERT_TAG_VALUE_JAVASCRIPT = "insertTagValue";
    public static final String INSERT_TAGS_DATA_JAVASCRIPT = "insertTagsData";

    public static final String INSERT_LANGUAGE_JAVASCRIPT ="insertLanguage";
    public static final String INSERT_LOCAL_STORAGE_MEM_All_JAVASCRIPT ="insertLocalStorageMemAll";
    public static final String INSERT_LOCAL_STORAGE_MEM_JAVASCRIPT ="insertLocalStorageMem";
    public static final String INSERT_VERSION_JAVASCRIPT ="insertVersion";

    public static final String INSERT_MAP_LIST_BY_NODE_JAVASCRIPT = "insertMapListByNode";
    public static final String INSERT_MAP_CONFIG_JAVASCRIPT = "insertMapConfig";

    //dialog
    public static final String ALARM_SUMMARY_TITLE_DIALOG = "Alarm";
    public static final String ALARM_SUMMARY_CLOSE_BUTTON_DIALOG = "Close";
    public static final String ALARM_SUMMARY_VIEW_BUTTON_DIALOG = "View";
    public static final int TAG_NAME_MODIFIED_LENGTH_DIALOG = 8;


    //baidu
    public static final String BAIDU_API_KEY = "PFPrBXtPvGpydK0gOfz2yBl1";

    //permissions
    public static final int SYSTEM_ALERT_WINDOW_PERMISSIONS_REQUEST_CODE = 0;
    public static final int WRITE_EXTERNAL_STORAGE_PERMISSIONS_REQUEST_CODE = 1;

    //folderName
    public static final String MERGE_IMAGE_FOLDER = "mergeImage";


    //sqlite
    public static final String DATABASE_NAME = "webaccessDB";
    public static final int DATABASE_VERSION = 1;
    public static final String ID_SQL = "id";
    //table user
    public static final String TABLE_USER_SQL = "User";
    public static final String USER_ID_SQL = "UserId";
    public static final String USER_USERNAME_SQL = "username";
    public static final String USER_PASSWORD_SQL = "password";
    public static final String USER_PROJECT_NAME_SQL = "projectName";
    public static final String USER_SERVER_TOKEN_SQL = "serverToken";
    public static final String USER_SERVER_IP_SQL = "ip";
    public static final String USER_TABLE_CREATE_SQL = "CREATE TABLE "
            + TABLE_USER_SQL + " ( "
            + USER_USERNAME_SQL + " text not null ," + USER_PASSWORD_SQL + " text not null ,"
            + USER_PROJECT_NAME_SQL + " text not null ,"+ USER_SERVER_TOKEN_SQL + " text not null ,"
            + USER_SERVER_IP_SQL + " text not null ,"
            + "CONSTRAINT "+USER_ID_SQL+" PRIMARY KEY ("+USER_USERNAME_SQL+","+USER_PROJECT_NAME_SQL+","+USER_SERVER_IP_SQL+")); ";

    //table system info
    public static final String TABLE_SYSTEM_INFO_SQL = "SystemInfo";
    public static final String SYSTEM_INFO_FIREBASE_TOKEN_SQL = "firebaseToken";
    public static final String SYSTEM_INFO_LAST_IP_SQL = "lastIP";
    public static final String SYSTEM_INFO_LAST_USERNAME_SQL = "lastUsername";
    public static final String SYSTEM_INFO_LAST_PASSWORD_SQL = "lastPassword";
    public static final String SYSTEM_INFO_LAST_PROJECT_NAME_SQL = "lastProjectName";
    public static final String SYSTEM_INFO_IS_LOGIN_SQL = "isLogin";
    public static final String SYSTEM_INFO_ACTION_LOG_PAGE_NAME_SQL = "actionLogPage";
    public static final String SYSTEM_INFO_ALARM_LOG_PAGE_NAME_SQL = "alarmLogPage";
    public static final String SYSTEM_INFO_ALARM_SUMMARY_LOG_PAGE_NAME_SQL = "alarmSummaryPage";
    public static final String SYSTEM_INFO_TREND_PAGE_NAME_SQL = "trendPage";
    public static final String SYSTEM_INFO_DASHBOARD_PAGE_NAME_SQL = "dashboardPage";
    public static final String SYSTEM_INFO_TAGS_INFO_PAGE_NAME_SQL = "tagsInfoPage";
    public static final String SYSTEM_INFO_G_MAP_PAGE_NAME_SQL = "gMapPage";
    public static final String SYSTEM_INFO_LAST_SERVER_TOKEN_SQL = "lastServerToken";
    public static final String SYSTEM_INFO_LANGUAGE_SQL = "language";
    public static final String SYSTEM_INFO_BAIDO_NOTIFICATION_CHANNEL_ID = "baiduNotificationChannelId";
    public static final String SYSTEM_INFO_DEVICE_ID = "deviceID";
    public static final String SYSTEM_INFO_NODE_PAGE_NAME_SQL = "nodePage";

    public static final String SYSTEM_INFO_TABLE_CREATE_SQL = "CREATE TABLE "
            + TABLE_SYSTEM_INFO_SQL + " ( " + ID_SQL + "  INTEGER primary key autoincrement, "
            + SYSTEM_INFO_FIREBASE_TOKEN_SQL + " text not null,"
            + SYSTEM_INFO_IS_LOGIN_SQL + " text not null,"
            + SYSTEM_INFO_LAST_IP_SQL + " text not null,"
            + SYSTEM_INFO_LAST_PROJECT_NAME_SQL + " text not null,"
            + SYSTEM_INFO_LAST_USERNAME_SQL + " text not null,"
            + SYSTEM_INFO_LAST_PASSWORD_SQL + " text not null,"
            + SYSTEM_INFO_LAST_SERVER_TOKEN_SQL + " text not null,"
            + SYSTEM_INFO_ACTION_LOG_PAGE_NAME_SQL + " text not null,"
            + SYSTEM_INFO_ALARM_LOG_PAGE_NAME_SQL + " text not null,"
            + SYSTEM_INFO_ALARM_SUMMARY_LOG_PAGE_NAME_SQL + " text not null,"
            + SYSTEM_INFO_TREND_PAGE_NAME_SQL + " text not null,"
            + SYSTEM_INFO_DASHBOARD_PAGE_NAME_SQL + " text not null,"
            + SYSTEM_INFO_TAGS_INFO_PAGE_NAME_SQL + " text not null,"
            + SYSTEM_INFO_G_MAP_PAGE_NAME_SQL + " text not null,"
            + SYSTEM_INFO_LANGUAGE_SQL + " text not null,"
            + SYSTEM_INFO_BAIDO_NOTIFICATION_CHANNEL_ID + " text not null,"
            + SYSTEM_INFO_DEVICE_ID + " text not null,"
            + SYSTEM_INFO_NODE_PAGE_NAME_SQL + " text not null"
            +"); ";

    //table server
    public static final String TABLE_SERVER_SQL = "Server";
    public static final String SERVER_IP_SQL = "ip";
    public static final String SERVER_FIREBASE_TOKEN_ENABLE_SQL = "firebaseTokenEnable";
    public static final String SERVER_UUID_SQL = "UUID";
    public static final String SERVER_TABLE_CREATE_SQL = "CREATE TABLE "
            + TABLE_SERVER_SQL + " ( "
            + SERVER_IP_SQL + " text not null ,"
            + SERVER_FIREBASE_TOKEN_ENABLE_SQL + " text not null ,"
            + SERVER_UUID_SQL + " text not null ,"
            +" PRIMARY KEY ("+SERVER_IP_SQL+")); ";

    //table project
    public static final String TABLE_PROJECT_SQL = "Project";
    public static final String PROJECT_ID_SQL = "ProjectId";
    public static final String PROJECT_IP_SQL = "ip";
    public static final String PROJECT_NAME_SQL = "projectName";
    public static final String PROJECT_TABLE_CREATE_SQL = "CREATE TABLE "
            + TABLE_PROJECT_SQL + " ( "
            + PROJECT_IP_SQL + " text not null ,"
            + PROJECT_NAME_SQL + " text not null ,"
            + "CONSTRAINT "+PROJECT_ID_SQL+" PRIMARY KEY ("+PROJECT_IP_SQL+","+PROJECT_NAME_SQL+")); ";

    //util
    public static final int PHOTO = 99;
    public static final int BITMAP_COMPRESS_RATIO = 30;
    public static final String SERVER_URL_STRING="serverUrl";
    public static final String IMAGE_ARRAY="imgArr";
    public static final String OPEN_BRACE = "{";
    public static final String CLOSE_BRACE = "}";
    public static final String TOKEN = "token";
    public static final String RESULT_REST_API = "resStatus";
    public static final String RES_STRING_REST_API = "resString";
    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String HTTP = "http:";
    public static final String HTTPS = "https:";
    public static final String SLASH = "//";
    public static final String EMPTY_STRING = "";
    public static final String IP = "ip";
    public static final String USERNAME = "username";
    public static final String ACCOUNT = "account";
    public static final String PASSWORD = "password";
    public static final String REMEMBER = "remember";
    public static final String TYPE = "type";
    public static final String PROJECT_NAME = "projectName";
    public static final String PROJECT_NAME_1 = "projectName1";
    public static final String PROJECT = "project";
    public static final String TRUE_STRING = "true";
    public static final String FALSE_STRING = "false";
    public static final String FIREBASE_TOKEN = "firebaseToken";
    public static final String DOUBLE_QUOTES="\"";
    public static final String JAVASCRIPT="javascript";
    public static final String IP_LIST="ipList";
    public static final String PROJECT_LIST="projectList";
    public static final String ACCOUNT_LIST="accountList";
    public static final String FUNCTION_LIST="funcList";
    public static final String HTTP_FAIL="{"+DOUBLE_QUOTES+RESULT_REST_API+DOUBLE_QUOTES+":"+ONE+"}";
    public static final String URL="url";
    public static final String START="start";
    public static final String COUNT="count";
    public static final String FILTERS="filters";
    public static final String SORT="sort";
    public static final String COOKIE="Cookie";
    public static final String STATUS = "status";
    public static final String SERVER_TOKEN_TITLE="WDT=";
    public static final String SEMICOLON=";";
    public static final String NODE_LISTS="nodeLists";
    public static final String TREND_LIST="trendList";
    public static final String TREND_GROUR_ID="trendGroupId";
    public static final String TREND_CONFIG="trendConfig";
    public static final String MERGE_IMAGE_ARRAY="mergeImgArr";
    public static final String MERGE_IMAGE_ARRAY_S="mergeImgArr[]";
    public static final String IMAGE_BYTE="imageByte";
    public static final String TARGET_IMAGE="targetImg";
    public static final String RESULT="result";
    public static final char BACKSLASH_CHAR='\\';

    public static final String NODE_NAME="nodeName";
    public static final String TAGS_LIST="tagsList";
    public static final String UUID="UUID";
    public static final String DATA = "data";
    public static final String TOTAL_COUNT ="totalCount";
    public static final String TAGS_LOWERCASE ="tags";
    public static final String TAGS_UPPERCASE ="Tags";
    public static final String TAG_INFOS ="tagInfos";
    public static final String TAGS_DATA ="tagsData";
    public static final String ENPTY_ARRAY_STRING="[]";
    public static final String NOTIFICATION="notification";
    public static final String IS_SCREEN_ON="isScreenOn";
    public static final String SCREEN_ON_STRING = "bright";
    public static final String LANG = "lang";
    public static final String LANGUAGE="language";
    public static final String ANDROID="Android";
    public static final String BAIDU_NOTIFICATION_CHANNELID="baiduNotificationChannelId";
    public static final String KEY="key";
    public static final String VALUE="value";
    public static final String DEVICE_ID="deviceID";
    public static final String DEVICE_TYPE="deviceType";
    public static final String IS_NOTIFY="isNotify";
    public static final String APP_TYPE="appType";
    public static final String SCADA="scada";
    public static final String APNS_TOKEN="apnsToken";
    public static final String PUSH_MESSAGE_TYPE="pushMessageType";
    public static final String INTERVAL="Interval";
    public static final String RECORDS="Records";
    public static final String VERSION ="version";

    public static final String G_MAP = "map";
    public static final String NAME = "name";
    public static final String MAP_LIST = "mapList";
    public static final String MAP_TYPE = "mapType";
    public static final String MAP_NAME = "mapName";

    //time
    public static final int ONE_SECOND_TIME=1000;
    public static final int SCROLL_DELAY_TIME=250;

    //page
    public static final String CONTROL_PAGE_NAME = "Controller";
    public static final String HOME_PAGE_NAME = "homePage";
    public static final String INTRODUCTION_PAGE_NAME = "introduction";
    public static final String MERGE_IMAGE_PAGE_NAME = "mergeImage";
    public static final String UPLOAD_PAGE_NAME = "upload";
    public static final String ABOUT_PAGE_NAME = "about";


    //controller command
    public static final String GET_MERGE_IMAGE_ALL_SRC_COMMAND = "getMergeImageAllSrc";
    public static final String MERGE_IMAGE_EXE_COMMAND = "mergeImageExe";
    public static final String SELECT_IMAGE_FILE_COMMAND = "selectImageFile";

    public static final String INPUT_CONNECT_IP_COMMAND = "inputConnectIP";
    public static final String GET_IP_HISTORY_LIST_COMMAND = "getIpHistoryList";
    public static final String INPUT_ACCOUNT_COMMAND = "inputAccount";
    public static final String GET_ACCOUNT_HISTORY_LIST_COMMAND = "getAccountHistoryList";
    public static final String GET_PROJECT_LIST_COMMAND = "getProjectList";
    public static final String GET_FUNCTION_LIST_COMMAND = "getFunctionList";
    public static final String GET_VERSION_COMMAND = "getVersion";
    public static final String GET_ALARM_SUMMARY_BY_PAGE_COMMAND = "getAlarmSummaryByPage";
    public static final String GET_PROJECT_LIST_BY_IP_COMMAND = "getProjectListByIp";
    public static final String GET_NODE_LIST_COMMAND = "getNodeList";
    public static final String GET_R_TREND_GROUP_ID_COMMAND = "getRTrendGroupId";
    public static final String GET_R_TREND_CONFIG_COMMAND = "getRTrendConfig";
    public static final String GET_TAGS_DATA_COMMAND = "getTagsData";
    public static final String GET_REAL_TIME_TAG_VALUES_COMMAND = "getRealTimeTagValues";
    public static final String GET_ALARM_LOG_AND_COUNT_COMMAND = "getAlarmLogAndCount";
    public static final String GET_ACTION_LOG_AND_COUNT_COMMAND = "getActionLogAndCount";
    public static final String SAVE_FUNCTION_LIST_COMMAND = "saveFunctionList";
    public static final String ALARM_ACK_COMMAND = "alarmAck";
    public static final String ALARM_ACK_ALL_LIST_COMMAND = "alarmAckAll";
    public static final String GET_TAGS_LIST_BY_PAGE_COMMAND = "getTagsListByPage";
    public static final String GET_TAG_VALUE_COMMAND = "getTagValue";
    public static final String SET_TAG_VALUE_COMMAND = "setTagValue";
    public static final String GET_LANGUAGE_COMMAND = "getLanguage";
    public static final String SET_LANGUAGE_COMMAND = "setLanguage";
    public static final String GET_NODE_STATUS_COMMAND = "getNodeStatus";
    public static final String LOGOUT_COMMAND = "logout";

    public static final String GET_MAP_LIST_BY_NODE_COMMAND = "getMapListByNode";
    public static final String GET_MAP_CONFIG = "getMapConfig";
    public static final String GET_LOCAL_STORAGE_MEM_ALL_COMMAND="getLocalStorageMemAll";

    //rest api type
    public static String SERVER_API_TYPE = "server";
    public static String EXE_API_TYPE = "exe";
    public static String FILE_API_TYPE = "file";
    public static String USER_API_TYPE = "user";

    //rest api
    public static String SERVER_IS_EXIST_API = SERVER_URL + "/server/isExist";
    public static String GET_LOCAL_PATH_ALL_API = SERVER_URL + "/file/getLocalPathAll";
    public static String MERGE_IMAGE_ALL_API = SERVER_URL + "/exe/mergeImage";
    public static String UPLOAD_IMAGE_API = SERVER_URL + "/file/uploadMergeImageMobile";


//    public static String READ_PROJECT_LIST_REST_API = SERVER_URL + "/WADashboard/api/dashboard/v1/mainframes/readProjectList";
//    public static String GET_WEBACCESS_PROJECT_LIST_API = SERVER_URL + "/WADashboard/api/dashboard/v6/waConfig/getWebAccessProjectList";
//    public static String GET_VERSION_API = SERVER_URL + "/WADashboard/api/dashboard/v6/waConfig/getDashReVer";
//    public static String GET_DASHBOARD_TOKEN_REST_API = SERVER_URL + "/WADashboard/api/dashboard/v6/auth/getToken";
//    public static String GET_NODE_LIST_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/getNodeList";
//    public static String GET_R_TREND_GROUP_ID_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/getRTrendGroupId";
//    public static String GET_R_TREND_CONFIG_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/getRTrendConfig";
//    public static String GET_TAGS_DATA_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/getTagsData";
//    public static String ALARM_ACK_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/alarmAck";
//    public static String ALARM_ACK_ALL_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/alarmAckAll";
//    public static String GET_TAG_LIST_BY_PAGE_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/getTagListByPage";
//    public static String SET_TAG_VALUES_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/tagAjaxAction/setTagValues";
//    public static String SUBSCRIBE_NOTIFY_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v1/mobile/subscribeNotify";
//    public static String UNSUBSCRIBE_NOTIFY_REST_API = SERVER_URL +"/WADashboard/api/dashboard/v6/mobile/unSubscribeNotify";
//
//    public static String GET_GOOGLE_MAP_LIST_REST_API = "/WADashboard/api/dashboard/v1/tagAjaxAction/getGoogleMapList";
//    public static String GET_BAIDU_MAP_LIST_REST_API = "/WADashboard/api/dashboard/v1/tagAjaxAction/getBaiduMapList";
//    public static String GET_GOOGLE_MAP_CONFIG_REST_API = "/WADashboard/api/dashboard/v1/tagAjaxAction/getGoogleMapConfig";
//    public static String GET_BAIDU_MAP_CONFIG_REST_API = "/WADashboard/api/dashboard/v1/tagAjaxAction/getBaiduMapConfig";

    //extraData
    public static final String ACTION_EXTRA_KEY = "action";
    public static final String ALARM_SUMMARY_EXTRA_VALUE = "alarmSummary";
    public static final String NORMAL_EXTRA_VALUE = "normal";

    //loadview
    public static final int WIDTH_LOADING_VIEW = 150;
    public static final int HEIGHT_LOADING_VIEW = 150;

    //pushMessageType
    public static final String FIREBASE_PUSH_MESSAGE_TYPE = "firebase";
    public static final String BAIDU_PUSH_MESSAGE_TYPE = "baidu";
    public static final String CHINA_PUSH_MESSAGE_TYPE = "China";

    //language
    public static final String EN_LANGUAGE="en";
    public static final String FR_LANGUAGE="fr";
    public static final String JA_LANGUAGE="ja";
    public static final String KO_LANGUAGE="ko";
    public static final String ZH_CN_LANGUAGE="zh_cn";
    public static final String ZH_TW_LANGUAGE="zh_tw";
}

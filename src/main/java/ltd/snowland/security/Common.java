package ltd.snowland.security;

public class Common {
	public static int SGD_SM1_ECB = 0X00000101;
	public static int SGD_SM1_CBC = 0X00000102;
	public static int SGD_SM1_CFB = 0X00000104;
	public static int SGD_SM1_OFB = 0X00000108;
	public static int SGD_SM1_MAC = 0X00000110;
	
	public static int SGD_SSF33_ECB = 0X00000201;
	public static int SGD_SSF33_CBC = 0X00000202;
	public static int SGD_SSF33_CFB = 0X00000204;
	public static int SGD_SSF33_OFB = 0X00000208;
	public static int SGD_SSF33_MAC = 0X00000210;
	
	public static int SGD_SM4_ECB = 0X00000401;
	public static int SGD_SM4_CBC = 0X00000402;
	public static int SGD_SM4_CFB = 0X00000404;
	public static int SGD_SM4_OFB = 0X00000408;
	public static int SGD_SM4_MAC = 0X00000410;
	
	public static int SGD_ZUC_EEA3 = 0X00000801;
	public static int SGD_ZUC_EIA3 = 0X00000802;
	
	
	public static int SGD_RSA = 0X00010000;
	public static int SGD_SM2 = 0X00020100;
	public static int SGD_SM2_1 = 0X00020200;
	public static int SGD_SM2_2 = 0X00020400;
	public static int SGD_SM2_3 = 0X00020800;

	public static int SGD_SM9 = 0X00040100;
	public static int SGD_SM9_1 = 0X00040200;
	public static int SGD_SM9_2 = 0X00040400;
	public static int SGD_SM9_3 = 0X00040800;
	
	public static int SGD_SM3 = 0X00000001;
	public static int SGD_SHA1 = 0X00000002;
	public static int SGD_SHA256 = 0X00000004;
	
	public static int SGD_SM3_RSA = 0X00010001;
	public static int SGD_SHA1_RSA = 0X00010002;
	public static int SGD_SHA256_SHA = 0X00010004;

	public static int SGD_SM3_SM2 = 0X00020201;
	public static int SGD_SM3_SM9 = 0X00040201;
	
	public static int SGD_KEY_INDEX = 0X00000101;
	public static int SGD_SECRET_KEY = 0X00000102;
	public static int SGD_PUBLIC_KEY_SIGN = 0X00000103;
	public static int SGD_PUBLIC_KEY_ENCRYPT = 0X00000104;
	public static int SGD_PRIVATE_KEY_SIGN = 0X00000105;
	public static int SGD_PRIVATE_KEY_ENCRYPT = 0X00000106;
	public static int SGD_KEY_COMPONENT = 0X00000107;
	public static int SGD_PASSWORD = 0X00000108;
	public static int SGD_PUBLIC_KEY_CERT = 0X00000109;
	public static int SGD_ATTRIBUTE_CERT = 0X0000010A;
	public static int SGD_SIGNATURE_DATA = 0X00000111;
	public static int SGD_ENVELOPE_DATA = 0X00000112;
	public static int SGD_RANDOM_DATA = 0X00000113;
	public static int SGD_PLAIN_DATA = 0X00000114;
	public static int SGD_CIPHER_DATA = 0X00000115;
	public static int SGD_DIGEST_DATA = 0X00000116;
	public static int SGD_USER_DATA = 0X00000117;
	
	public static int SGD_CERT_VERSION = 0X00000001;
	public static int SGD_CERT_SERIAL = 0X00000002;
	public static int SGD_CERT_ISSUER = 0X00000005;
	public static int SGD_CERT_VALID_TIME = 0X00000006;
	public static int SGD_CERT_SUBJECT = 0X00000007;
	public static int SGD_CERT_DER_PUBLIC_KEY = 0X00000008;
	public static int SGD_CERT_DER_PUBLIC_EXTENSIONS = 0X00000009;
	public static int SGD_EXT_AUTHORITYKEYIDENTIFIER_INFO = 0X00000011;
	public static int SGD_EXT_SUBJECTKEYIDENTIFIER_INFO = 0X00000012;
	public static int SGD_EXT_KEYUSAGE_INFO = 0X00000013;
	public static int SGD_EXT_PRIVATEKEYUSAGEPERIOD_INFO = 0X00000014;
	public static int SGD_EXT_CERTIFICATEPOLICIES_INFO = 0X00000015;
	public static int SGD_EXT_POLICYMAPPING_INFO = 0X00000016;
	public static int SGD_EXT_BASICCONSTRAINTS_INFO = 0X00000017;
	public static int SGD_EXT_POLICYCONSTRAINTS_INFO = 0X00000018;
	public static int SGD_EXT_EXTKEYUSAGE_INFO = 0X00000019;
	public static int SGD_EXT_CRLDISTRIBUTIONPOINTS_INFO = 0X0000001A;
	public static int SGD_EXT_NESCAPE_INFO = 0X0000001B;
	public static int SGD_EXT_SELFDEFINED_EXTENSION_INFO = 0X0000001C;
	public static int SGD_CERT_ISSUER_CN = 0X00000021;
	public static int SGD_CERT_ISSUER_O = 0X00000022;
	public static int SGD_CERT_ISSUER_OU = 0X00000023;
	public static int SGD_CERT_SUBJECT_CN = 0X00000031;
	public static int SGD_CERT_SUBJECT_O = 0X00000032;
	public static int SGD_CERT_SUBJECT_OU = 0X00000033;
	public static int SGD_CERT_SUBJECT_EMAIL = 0X00000034;
	public static int SGD_CERT_NOTBEFORE_TIME = 0X00000035;
	public static int SGD_CERT_NOTAFTER_TIME = 0X00000036;
	
	public static int SGD_TIME_OF_STAMP = 0X00000201;
	public static int SGD_CN_OD_TSSIGNER = 0X00000202;
	public static int SGD_ORINGICAL_DATA = 0X00000203;
	public static int SGD_CERT_OF_TSSERVER = 0X00000204;
	public static int SGD_CENTCHAIN_OF_TSSERVER = 0X00000205;
	public static int SGD_SOURCE_OF_TIME = 0X00000206;
	public static int SGD_TIME_PRECISION = 0X00000207;
	public static int SGD_RESPONSE_TYPE = 0X00000208;
	public static int SGD_SUBJECT_COUNTRY_OF_TSSIGNER = 0X00000209;
	public static int SGD_SUBJECT_ORGNIZATION_OF_TSSIGNER = 0X0000020A;
	public static int SGD_SUBJECT_CITY_OF_TSSIGNER = 0X0000020B;
	public static int SGD_SUBJECT_EMAIL_OF_TSSIGNER = 0X0000020C;
	
	public static int SGD_SP_ID = 0X00000001;
	public static int SGD_SP_USER_ID = 0X00000002;
	public static int SGD_IDP_ID = 0X00000003;
	public static int SGD_IDP_USER_ID = 0X00000004;
	
	public static int SGD_ENCODING_RAW = 0X00000000;
	public static int SGD_ENCODING_DER = 0X01000000;
	public static int SGD_ENCODING_BASE64 = 0X02000000;
	public static int SGD_ENCODING_PEM = 0X03000000;
	public static int SGD_ENCODING_TXT = 0X04000000;
	
	public static int SGD_PROTOCOL_CSP = 1;
	public static int SGD_PROTOCOL_PKCS11 = 2;
	public static int SGD_PROTOCOL_SDS = 3;
	public static int SGD_PROTOCOL_UKEY = 4;
	public static int SGD_PROTOCOL_CNG = 5;
	public static int SGD_PROTOCOL_GCS = 6;
	
	public static int SGD_CRL_VERIFY = 1;
	public static int SGD_OSXP_VERIFY = 2;
	
	public static int SGD_ROLE_SUPER_MANAGER = 0X00000001;
	public static int SGD_ROLE_MANAGER = 0X00000002;
	public static int SGD_ROLE_AUDIT_MANAGER = 0X00000003;
	public static int SGD_ROLE_AUDITOR = 0X00000004;
	public static int SGD_ROLE_OPERATOR = 0X00000005;
	public static int SGD_ROLE_USER = 0X00000006;
	
	public static int SGD_OPERATION_SIGNIN = 0X00000001;
	public static int SGD_OPERATION_SIGNOUT = 0X00000002;
	public static int SGD_OPERATION_CREATE = 0X00000003;
	public static int SGD_OPERATION_DELETE = 0X00000004;
	public static int SGD_OPERATION_MODIFY = 0X00000005;
	public static int SGD_OPERATION_CHG_PWD = 0X00000006;
	public static int SGD_OPERATION_AUTHORIZATION = 0X00000007;

	public static int SGD_OPERATION_SUCCESS = 0X00000000;

	public static int SGD_MAIN_KEY = 0X00000101;
	public static int SGD_DEVICE_KEYS = 0X00000102;
	public static int SGD_USER_KEYS = 0X00000103;
	public static int SGD_KEK = 0X00000104;
	public static int SGD_SESSION_KEY = 0X00000105;
	public static int SGD_PRIKEY_PASSWORD = 0X00000106;
	public static int SGD_COMPARTITION_KEY = 0X00000107;
	
	public static int SGD_KEK_GENERATION = 0X00000101;
	public static int SGD_KEK_DISPENSE = 0X00000102;
	public static int SGD_KEK_IMPORT = 0X00000103;
	public static int SGD_KEK_EXPORT = 0X00000104;
	public static int SGD_KEK_DIVISION = 0X00000105;
	public static int SGD_KEK_COMPOSE = 0X00000106;
	public static int SGD_KEK_RENEWAL = 0X00000107;
	public static int SGD_KEK_BACKUP = 0X00000108;
	public static int SGD_KEK_RESTORE = 0X00000109;
	public static int SGD_KEK_DESTROY = 0X0000010A;
	
	public static int SGD_SYSTEM_INIT = 0X00000201;
	public static int SGD_SYSTEM_START = 0X00000202;
	public static int SGD_SYSTEM_SHUT = 0X00000203;
	public static int SGD_SYSTEM_RESTART = 0X00000204;
	public static int SGD_SYSTEM_QUERY = 0X00000205;
	public static int SGD_SYSTEM_BACKUP = 0X00000206;
	public static int SGD_SYSTEM_RESTORE = 0X00000207;

	public static int SGD_DEVICE_SORT = 0X00000201;
	public static int SGD_DEVICE_TYPE = 0X00000202;
	public static int SGD_DEVICE_NAME = 0X00000203;
	public static int SGD_DEVICE_MANUFACTURER = 0X00000204;
	public static int SGD_DEVICE_HARDWARE_VERSION = 0X00000205;
	public static int SGD_DEVICE_SOFTWARE_VERSION = 0X00000206;
	public static int SGD_DEVICE_STANDARD_VERSION = 0X00000207;
	public static int SGD_DEVICE_SEIAL_NUMBER = 0X00000208;
	public static int SGD_DEVICE_SUPPORT_ASYM_ALG = 0X00000209;
	public static int SGD_DEVICE_SUPPORT_SYMM_ALG = 0X0000020A;
	public static int SGD_DEVICE_SUPPORT_HASH_ALG = 0X0000020B;
	public static int SGD_DEVICE_SUPPORT_STORAGE_SPACE = 0X0000020C;
	public static int SGD_DEVICE_SUPPORT_FREE_SPACE = 0X0000020D;
	public static int SGD_DEVICE_RUNTIME = 0X0000020E;
	public static int SGD_DEVICE_USED_TIMES = 0X0000020F;
	public static int SGD_DEVICE_LOCATION = 0X00000210;
	public static int SGD_DEVICE_DESCRIPTION = 0X00000211;
	public static int SGD_DEVICE_MANAGER_INFO = 0X00000212;
	public static int SGD_DEVICE_MAX_DATA_SIZE = 0X00000213;

	public static int SGD_DEVICE_SORT_SJ = 0X02000000;
	public static int SGD_DEVICE_SORT_SK = 0X03000000;
	public static int SGD_DEVICE_SORT_SM = 0X04000000;
	
	public static int SGD_DEVICE_SORT_FE = 0X00000100;
	public static int SGD_DEVICE_SORT_FA = 0X00000200;
	public static int SGD_DEVICE_SORT_FM = 0X00000400;
	
	public static int SGD_STATUS_INIT = 0X00000201;
	public static int SGD_STATUS_READY = 0X00000202;
	public static int SGD_STATUS_EXCEPTION = 0X00000203;
	
}

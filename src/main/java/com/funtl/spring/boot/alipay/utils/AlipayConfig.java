package com.funtl.spring.boot.alipay.utils;

public class AlipayConfig {

	public static String app_id = "2016100100636107";//�ں�̨��ȡ���������ã�
	
	public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC1el+esyjd5vhX1/ElnqHsC4d9rYdPtvUmVC5gVEaGEb+vVr0btlQ9FDlW46l6uXE2uSl8q2LZcdvRLL72VPy7HxHIAvM3ZZ8Iv+qoZfVYq3itpxLDKkBIJXe1bGwEHAhWe94LFsTPHOEhDjzbaIEQp/OWK5/uIrRw4vGNo8DoSilJTew5EBNMKPeemElP+rjVPH+7xWCRZwWWCrFQc/HGPRAkfciZZ/t5p7NVALDN8ImJuMnKpLYIm6YKysQGhaQu/G0ghJ9Ks876e5SdUklkL1irbeHAXL2El7iuO9UtFkVeZANIc3fVtx9DjHDKBOVQ5bg0cypMMQz/bWyIvlQ7AgMBAAECggEASp/QlAyuAFmKw2x7r/GEOfEfvPFPU9szAZjaHShqe5Tu0qYDS1L1XsxjK7SgK2P4Bv2q7qX3Ft03+9K/j8Gwzy1efXWhF6WE+O8aCjcq5VRVYmryTyifmEs353V3EVWJpC55RuwM7/G7LYGSStK1R+kYRCcaM603r7fShmDQ4XN0E90m1UvvWIDvrw8xsZZ/L0VmCUD7kR7J5G8Vu0PJMtRsj3wCmrik4CyFKCbbuisWZ/DaU+FRPzdajKHJ4Nugl7PCxhNYWUeYxqm14LSr4uY0O6uxkZJ+qQENUs3XSOxFxbvntP71BPGYrrhNUfA2ZRmOLGS7glMiCHAdgO2rqQKBgQDf5ta5F5sbMoIDOJkKh87Zga5xh5WTzS2rsX2mwnFWMNVwgWWCsHIcQTaP5tsAvk1fruY/PMTW1YrO5zgVJWZEJxD6GgXjbWyVoK2313ySJ6nzNFRJK3WKWVpm8sdl4MwE4Dk0pvdsE4YiDQIitWFrfNX/aZfldo1fZ7cSfiSXbQKBgQDPfpdbsGDB/MCSpj4pixQp+Z5JfjmdTm/xuE/1VtUmCpfggAINlyiVbkCfJ2U2J5sts6dh/oM2mT7R4FyAyDNlR+7YeKYE+brBaJmBhHHwDAtulfu6QSyyCdoOgZUwHC3+eMZMjl2LCtPeq11EkcT6KaH47tnJs9MnH3K8QWuJRwKBgAZsQMyeeLyW/lPJU9qResWSisaG9SuAP0clmE0oVsf6LqVDkP3mwd89n6sRHEcxLlcIVWKLA7qF9a1pxJoWsJBT7pC+Hl0fznWcXl9ftxsaOC3Z2nEe5ghJ9+XsIPwzLqcVJ47zGzXmeXqQlPcZ7OmAc0MYbFsQw41xFDdblwEhAoGAdtKNpsoYfr5ZISHmUy/7+hWiWX/ZSoYSgSAFWf/BzCkg1EU558J6USh0BTAwO5Tuvns1DV8MkQWs/c836d+73vIUiw58NDk2g299CLhp7wdWvJtTLlQIXmRZ5Ri78HMSu7k6Bbk5RFiM/+SuYof/fyq8QKu3OFSsRKkzsS7dgB0CgYAWcEBTSHMv0ISjrM6qKPZiQKEe8BxzaBp9sK5WmFBOpkoxDxJ2fKajBuWqMCp7APLqiuFyqkA477rAxcPApMk01fioct18YWR5SGG4Ov7GvFq/qOyrwr4CWsZrbJo6xtexhZzVTQaQ0uKo+QUc+M+05tYKrWY7D5/yOzGIN4T04Q==";//�̳̲鿴��ȡ��ʽ���������ã�

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA6591Hl2tQoHpbhmSyJ6nQmalmDOD/wFQGIyyth04bZMxDlEDpbHP0YFs5f61nH/WFx5dQyswOIQZ2qJt5fCSbdK8Ka+J9gCPCnS0DBSFLfWS5prIEOZiBnKMqVMoAhL8KLGavzwNDVBRx4EAbUvRutRlM5R9OsklwhyjpLDr8sQHU2N3GcmQwbrxq8RFjSvTAT41a7DL6UeZBbdXSGLzKohJEynWHKyfe77DJgREpM35rLWoOnfBJUj+8+gjHAobiyJrUQO8tm0UIjcEXmpA9BiLc8AzViKJA6tDo0dKvmw0p9/ngkJm54C2BaxwxeDwRtGcTmBK+9Y98qy7o4DYfQIDAQAB";//�̳̲鿴��ȡ��ʽ���������ã�
	
	public static String notify_url = "http://localhost:8081/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://localhost:8081/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//ע�⣺ɳ����Ի�������ʽ����Ϊ��https://openapi.alipay.com/gateway.do
}

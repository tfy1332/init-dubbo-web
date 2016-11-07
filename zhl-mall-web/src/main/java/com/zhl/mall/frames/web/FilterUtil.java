package com.zhl.mall.frames.web;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.List;
import java.util.Map;

/**
 * 验证URl的工具，目前采用spring ant path matcher
 * by tanfy 2016-07-06
 */
public class FilterUtil {
    private PathMatcher  matcher = new AntPathMatcher();
    
    /**校验URl
     * @param surl 该参数应该先去除 contextPath
     * @param noFilterList 不验证的url
     * @param filterMap 必须验证的URl
     * @return 是否应该跳过验证
     */
    public boolean filterUrl(String surl, List<String> noFilterList,Map<String, String[]> filterMap) {
		String uri = cutUrl(surl);
		boolean flag = false;
		if(noFilterList.size()>0){
		    for (String no : noFilterList) {
	            if(matcher.match(no, uri)){
	                flag = true;
	                if(filterMap.containsKey(no)){
	                    String[] second = filterMap.get(no);
	                    if(second!=null && second.length>0){
	                        for (String yes : second) {
	                            if(matcher.match(yes, uri)){
	                                flag = false;
	                                break;
	                            }
                            }
	                    }
	                }
	                break;
	            }
	        }
		}
        return flag;
	}
	private String cutUrl(String url) {
		String surl = url;
		if (StringUtils.isNotEmpty(url)) {
			if (surl.indexOf("?") != -1) {
				int i = surl.indexOf("?");
				surl = surl.substring(0, i);
			}
		}
		return surl;
	}
}

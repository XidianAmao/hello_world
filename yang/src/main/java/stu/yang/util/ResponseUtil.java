package stu.yang.util;

import stu.yang.domain.AbstractBaseResponse;
import stu.yang.domain.BaseDataResponse;
import stu.yang.domain.ListDataResponse;
import stu.yang.domain.PageInfo;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.ResponseCodeEnum;

import java.util.List;

public class ResponseUtil {
    public ResponseUtil() {
    }

    public static <T> PagedListResponse<T> getPagedResultListResponse(int totalCount, int pageSize, int curPage, List<T> data) {
        PagedListResponse<T> response = new PagedListResponse();
        response.setList(data);
        PageInfo pageInfo = new PageInfo();
        pageInfo.setCurrentPage(curPage);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalCount(totalCount);
        response.setPageInfo(pageInfo);
        return response;
    }

    public static <T> PagedListResponse<T> getPagedResultListResponse(PageInfo pageInfo, List<T> data) {
        PagedListResponse<T> response = new PagedListResponse();
        response.setList(data);
        response.setPageInfo(pageInfo);
        return response;
    }

    public static <T> PagedListResponse<T> getFailPagedResultListResponse(String message) {
        PagedListResponse<T> response = new PagedListResponse();
        response.setCode(ResponseCodeEnum.ResponseCodeEnum_Fail.getCode());
        response.setMessage(message);
        return response;
    }

    public static <T> ListDataResponse<T> getSuccessResultListResponse(List<T> list) {
        ListDataResponse response = new ListDataResponse();
        response.setMessage("success");
        response.setCode(ResponseCodeEnum.ResponseCodeEnum_Success.getCode());
        response.setList(list);
        return response;
    }

    public static ListDataResponse getFailResultListResponse(String message) {
        ListDataResponse response = new ListDataResponse();
        response.setMessage(message);
        response.setCode(ResponseCodeEnum.ResponseCodeEnum_Fail.getCode());
        return response;
    }

    public static <T> BaseDataResponse<T> getSuccessBaseDataResponse(T data) {
        BaseDataResponse response = new BaseDataResponse();
        response.setData(data);
        response.setMessage("success");
        response.setCode(ResponseCodeEnum.ResponseCodeEnum_Success.getCode());
        return response;
    }

    public static BaseDataResponse getFailBaseDataResponse(String message) {
        BaseDataResponse response = new BaseDataResponse();
        response.setMessage(message);
        response.setCode(ResponseCodeEnum.ResponseCodeEnum_Fail.getCode());
        return response;
    }

    public static <T> BaseDataResponse<T> getBaseDataResponse(Integer code, String message, T data) {
        BaseDataResponse response = new BaseDataResponse();
        response.setMessage(message);
        response.setCode(code);
        response.setData(data);
        return response;
    }

    public static AbstractBaseResponse getFailBaseDataResponse(String message, Class<?> clazz) {
        try {
            AbstractBaseResponse response = (AbstractBaseResponse)Class.forName(clazz.getName()).newInstance();
            response.setMessage(message);
            response.setCode(ResponseCodeEnum.ResponseCodeEnum_Fail.getCode());
            return response;
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static AbstractBaseResponse getFailBaseDataResponse(String message, String clazzName) {
        try {
            AbstractBaseResponse response = (AbstractBaseResponse)Class.forName(clazzName).newInstance();
            response.setMessage(message);
            response.setCode(ResponseCodeEnum.ResponseCodeEnum_Fail.getCode());
            return response;
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static AbstractBaseResponse getBusinessFailBaseDataResponse(String message, String clazzName) {
        try {
            AbstractBaseResponse response = (AbstractBaseResponse)Class.forName(clazzName).newInstance();
            response.setMessage(message);
            response.setCode(ResponseCodeEnum.BUSINESS_VALIDATE_FAIL.getCode());
            return response;
        } catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }
}

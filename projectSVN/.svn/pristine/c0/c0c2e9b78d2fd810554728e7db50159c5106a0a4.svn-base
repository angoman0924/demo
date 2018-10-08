package com.zacx.core.enums;

import java.util.Optional;

/**
 * @classDesc: 功能描述:(文件类型，上传文件的时候使用)
 * @author: 顾理想
 * @createTime: 2017年05月17日 19:06
 * @version: v1.0
 */
public enum FileTypeEnum {
    DOC("application/msword","doc"),
    DOCX("application/vnd.openxmlformats-officedocument.wordprocessingml.document","docx"),
    XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet","xlsx"),
    XLS("application/vnd.ms-excel","xls"),
    PDF("application/pdf","pdf"),
    JPG("image/jpeg","jpg"),
    TXT("text/plain","txt");
    private String contentType;
    private String suffix;



    FileTypeEnum(String contentType, String suffix){
        this.contentType = contentType;
        this.suffix= suffix;
    }
    /**
     *@methodDesc: 功能描述:(判断是否是 word文档)
     *@author: 顾理想
     *@param contentType
     *@createTime 2017年05月17日 19:16
     *@returnType boolean
     */
    public static boolean isWord(String contentType){
        return FileTypeEnum.DOC.getContentType().equals(contentType)|| FileTypeEnum.DOCX.getContentType().equals(contentType);
    }


    public static boolean isExcelSuffix(String suffix){
        return FileTypeEnum.XLSX.getSuffix().equals(suffix)|| FileTypeEnum.XLS.getSuffix().equals(suffix);
    }
    /**
     *@methodDesc: 功能描述:(判断是否是pdf)
     *@author: 顾理想
     *@param fileType
     *@createTime 2017年05月17日 20:24
     *@returnType boolean
     */
    public static boolean isPDF(String fileType){
        return FileTypeEnum.PDF.getContentType().equals(fileType);
    }
    /**
     *@methodDesc: 功能描述:(根据code值获取对象)
     *@author: 顾理想
     *@param contentType
     *@createTime 2017年05月18日 11:11
     *@returnType com.google.constants.base.Optional<java.lang.String>
     */
    public static Optional<FileTypeEnum> getByContentType(String contentType){
        for (FileTypeEnum en: FileTypeEnum.values()){
            if(en.getContentType().equals(contentType)){
                return Optional.of(en);
            }
        }
        return Optional.empty();
    }
    /**
     *@methodDesc: 功能描述:(根据后缀获取文件类型)
     *@author: 顾理想
     *@param suffix 文件后缀或者文件名 (doc|fileName.doc)
     *@createTime 2017年05月18日 17:01
     *@returnType com.google.constants.base.Optional<com.shanlinjinrong.constants.enums.FileTypeEnum>
     *@copyright:
     */
    public static Optional<FileTypeEnum> getBySuffix(String suffix){
        if(suffix==null){
            return Optional.empty();
        }
        int index = suffix.lastIndexOf(".");
        if(index!=-1){
            suffix = suffix.substring(index+1,suffix.length());
        }
        for (FileTypeEnum en: FileTypeEnum.values()){
            if(en.getSuffix().equalsIgnoreCase(suffix)){
                return Optional.of(en);
            }
        }
        return Optional.empty();
    }
    public String getContentType() {
        return contentType;
    }

    public String getSuffix() {
        return suffix;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Administrator
 */
public class FileDelete {

    public boolean deleteFile(File filePath) {
        boolean result = false;
        if (filePath.isDirectory()) {
            File[] delFiles = filePath.listFiles();
            for (File delFile : delFiles) {
                if (delFile.isDirectory()) {
                    result = deleteFile(delFile);
                } else {
                    result = delFile.delete();
                }
                if (!result) {
                    System.out.println("删除错误的文件或目录名：" + delFile.getName());
                    break;
                }
            }
            if (result) {
                //表示所有子目录和子文件都删除了,删除此空目录
                return filePath.delete();
            } else {
                return result;
            }
        } else if (filePath.isFile()) {
            result = filePath.delete();
        }
        return result;
    }

//    public boolean deleteFilePath(String path) {
//        File file = new File(path);
//        boolean result = false;
//        if (file.isDirectory()) {
//            File[] delFiles = file.listFiles();
//            for(File delFile: delFiles){
//                if(delFile.isDirectory()){
//                    System.out.println("删除文件目录");
//                    deleteFilePath(delFile.getAbsolutePath());// 递归调用del方法并取得子目录路径  
//                }
//                result = delFile.delete();
//            }
//        }else if(file.isFile()){
//            System.out.println("删除文件");
//            result = file.delete();
//        }
//        return result;
//    }
    public boolean delFilterFile(File filePath, final String filter) {
        boolean result = false;

        if (filePath.isDirectory()) {
            File[] files = filePath.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if (dir != null && name.contains(filter)) {
                        return true;
                    } else {
                        return false;
                    }
                }

            });
            for (File file : files) {
                //删除目录
                result = deleteFile(file);
                if (!result) {
                    System.out.println("删除错误的文件或目录名：" + file.getName());
                    break;
                }
            }
            return result;
        } else if (filePath.isFile()) {
            if (filePath.getName().contains(filter)) {
                result = filePath.delete();
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        FileDelete fu = new FileDelete();
//        fu.deleteFile(new File("E:/file/test"));
        System.out.println(fu.delFilterFile(new File("E:/file"), "coolcto"));
//        FileUtils.deleteDirectory(new File("E:/file/test1"));
//        FileUtils.forceDelete(new File("E:/file/test"));
//        System.out.println(fu.delFile(new File("E:/file/test1")));

    }
}

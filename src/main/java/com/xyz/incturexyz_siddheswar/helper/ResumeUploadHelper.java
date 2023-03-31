package com.xyz.incturexyz_siddheswar.helper;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class ResumeUploadHelper {
    public final String resumeUploadDirectory="D:\\IdeaProject\\InctureXYZ_Siddheswar\\src\\main\\resources\\static\\resume";


    public boolean fileUpload(MultipartFile multipartFile){
        boolean b = false;

        try{
//            InputStream is = multipartFile.getInputStream();
//            byte data[] = new byte[is.available()];
//            is.read(data);
//            //writing the files;
//            FileOutputStream fos = new FileOutputStream(resumeUploadDirectory+ File.separator+multipartFile.getOriginalFilename());
//            fos.write(data);
//            fos.flush();
//            fos.close();
            Files.copy(multipartFile.getInputStream(), Paths.get(resumeUploadDirectory+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);


            b=true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }



        return b;
    }
}

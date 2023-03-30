package com.bezkoder.springjwt.serviceimpl;

import com.bezkoder.springjwt.service.IUpload;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class UploadImpl implements IUpload {
    private final Path root = Paths.get("datn/uploads");
    @Override
    public String storeFile(InputStream inputStream, String fileName) throws IOException {
//        File directory = new File(root);
//        if(!directory.exists()){
//            directory.mkdirs();
//        }
        return null;
    }
}

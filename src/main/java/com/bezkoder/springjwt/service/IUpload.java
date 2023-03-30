package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Images;

import java.io.IOException;
import java.io.InputStream;

public interface IUpload {
    String storeFile(InputStream inputStream, String fileName) throws IOException;
}

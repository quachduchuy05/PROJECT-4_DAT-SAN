package com.example.demo.qdhController;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/api/upload")
public class QDHUploadController {

    private static final String UPLOAD_DIR = "uploads/";

    @PostMapping
    public String uploadFile(
            @RequestParam("file") MultipartFile file
    ) throws IOException {

        File folder = new File(UPLOAD_DIR);

        if (!folder.exists()) {
            folder.mkdirs();
        }

        String fileName =
                UUID.randomUUID() + "_" + file.getOriginalFilename();

        File saveFile = new File(UPLOAD_DIR + fileName);

        file.transferTo(saveFile);

        return "Upload thành công: " + fileName;
    }
}
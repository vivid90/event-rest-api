package com.example.demorestapi.upload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FileData {
    private String filename;
    private String url;
    private Long size;
}

package com.goit.gojavaonline;

import java.util.List;

/**
 * Created by User on 5/27/2016.
 */
public class Directory {
    private List<FileAudio> fileAudios;
    private List<FileImg> fileImgs;
    private List<FileTxt> fileTxts;

    public List<FileAudio> getFileAudios() {
        return fileAudios;
    }

    public void setFileAudios(List<FileAudio> fileAudios) {
        this.fileAudios = fileAudios;
    }

    public List<FileImg> getFileImgs() {
        return fileImgs;
    }

    public void setFileImgs(List<FileImg> fileImgs) {
        this.fileImgs = fileImgs;
    }

    public List<FileTxt> getFileTxts() {
        return fileTxts;
    }

    public void setFileTxts(List<FileTxt> fileTxts) {
        this.fileTxts = fileTxts;
    }
}

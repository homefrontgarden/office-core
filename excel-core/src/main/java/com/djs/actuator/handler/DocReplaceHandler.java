package com.djs.actuator.handler;

import com.djs.actuator.AbstractBaseReplace;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.*;

public class DocReplaceHandler extends AbstractBaseReplace {
    public DocReplaceHandler() {
    }

    public DocReplaceHandler(String fileString, String target, String source) {
        super(fileString, target, source);
    }

    @Override
    public void execute(){
        InputStream is = null;
        try {
            is = new FileInputStream(getFileString());
            HWPFDocument hwpfDocument = new HWPFDocument(is);
            Range range = hwpfDocument.getRange();
//            for(int i=0;i<range.numParagraphs();i++){
//                Paragraph paragraph = range.getParagraph(i);//段落
//                paragraph.replaceText(getTarget(),getSource());
//            }
//            range.replaceText(getTarget(),getSource());
            File file1 = new File(getFileString());
            OutputStream os = new FileOutputStream(file1);
            hwpfDocument.write(os);
            close(os);
            close(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    /**
     * 关闭输入流
     * @param is
     */
    private void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 关闭输出流
     * @param os
     */
    private void close(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

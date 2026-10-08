/**
 * <h1>Modulo do App</h1>
 * <p>Modulos de bibliotecas integrados ao app</p>
 */
module com.programandofodacci.aprendizado_linguagens {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires jfxtras.controls;
    requires javafx.web;
    requires javafx.media;
    requires javafx.swing;
    requires jfxtras.fxml;
    requires java.desktop;
    
    requires atlantafx.base;
    
    requires ch.qos.logback.classic;
    requires ch.qos.logback.core;
    requires com.calendarfx.view;
    requires com.github.oshi;
    requires com.github.weisj.jsvg;
    requires com.google.gson;
    requires com.google.zxing;
    requires com.dlsc.formsfx;
    requires com.dlsc.gemsfx;
    requires com.dlsc.keyboardfx;
    requires com.dlsc.pdfviewfx;
    requires com.dlsc.pickerfx;
    requires com.dlsc.preferencesfx;
    requires com.sun.jna;
    requires com.sun.jna.platform;
    
    requires fr.brouillard.oss.cssfx;
    
    requires jamepad;
    
    requires net.coobird.thumbnailator;
    requires net.synedra.validatorfx;
    
    requires org.apache.logging.log4j;
    requires org.apache.poi.ooxml;
    requires org.apache.poi.poi;
    requires org.apache.tika.core;
    requires org.bouncycastle.pkix;
    requires org.bouncycastle.provider;
    requires org.bouncycastle.util;
    requires org.controlsfx.controls;
    requires org.freedesktop.gstreamer;
    requires org.fxmisc.richtext;
    requires org.fxmisc.undo;
    requires org.kordamp.bootstrapfx.core;
    requires org.kordamp.desktoppanefx.core;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.fontawesome;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.material;
    requires org.kordamp.ikonli.materialdesign;
    requires org.postgresql.jdbc;
    requires org.slf4j;
    requires org.testfx;
    requires okhttp;
    
    requires tess4j;
    
    requires uk.co.caprica.vlcj;
    requires usb4java;
    
    opens com.programandofodacci.aprendizado_linguagens to javafx.fxml, 
            jfxtras.fxml, javafx.web, javafx.graphics;
    opens com.programandofodacci.aprendizado_linguagens.controllers to javafx.fxml;
    exports com.programandofodacci.aprendizado_linguagens;
}

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
    requires jfxtras.fxml;
    
    requires atlantafx.base;
    
    requires ch.qos.logback.classic;
    requires ch.qos.logback.core;
    requires com.calendarfx.view;
    requires com.google.gson;
    requires com.google.zxing;
    requires com.dlsc.formsfx;
    requires com.dlsc.gemsfx;
    requires com.dlsc.keyboardfx;
    requires com.dlsc.pdfviewfx;
    requires com.dlsc.pickerfx;
    requires com.dlsc.preferencesfx;
    
    requires fr.brouillard.oss.cssfx;
    
    requires net.synedra.validatorfx;
    
    requires org.controlsfx.controls;
    requires org.fxmisc.richtext;
    requires org.fxmisc.undo;
    requires org.kordamp.bootstrapfx.core;
    requires org.kordamp.desktoppanefx.core;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;
    requires org.apache.poi.poi;
    requires org.postgresql.jdbc;
    requires org.slf4j;
    requires org.testfx;
    
    opens com.programandofodacci.aprendizado_linguagens to javafx.fxml, jfxtras.fxml;
    exports com.programandofodacci.aprendizado_linguagens;
}

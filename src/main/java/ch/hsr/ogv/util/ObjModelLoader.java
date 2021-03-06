package ch.hsr.ogv.util;

import com.interactivemesh.jfx.importer.ImportException;
import com.interactivemesh.jfx.importer.obj.ObjModelImporter;
import javafx.scene.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

public class ObjModelLoader {

    private final static Logger logger = LoggerFactory.getLogger(ObjModelLoader.class);

    public static Node[] load(URL modelUrl) {
        Node[] rootNodes = {};
        if (modelUrl != null) {
            ObjModelImporter tdsImporter = new ObjModelImporter();
            try {
                tdsImporter.read(modelUrl);
            }
            catch (ImportException e) {
                e.printStackTrace();
                logger.debug(e.getMessage());
            }
            return tdsImporter.getImport();
        }
        return rootNodes;
    }

}

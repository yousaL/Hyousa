package hyousa.dfs.server.master;

import java.io.IOException;

/**
 * Created by yousa on 2017/12/16.
 */
public class FileAlreadyExistsException extends IOException {
    public FileAlreadyExistsException() {
        super();
    }

    public FileAlreadyExistsException(String msg) {
        super(msg);
    }
}

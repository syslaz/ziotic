package com.ziotic.io.sql;

import com.ziotic.utility.Configuration;
import com.ziotic.utility.Initiator;

/**
 * @author Lazaro
 */
public class SQLInitiator implements Initiator<SQLSession> {
    private Configuration cfg;

    public SQLInitiator(Configuration cfg) {
        this.cfg = cfg;
    }

    @Override
    public void init(SQLSession session) throws Exception {
        session.init(cfg);
    }
}

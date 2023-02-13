package io.getarrays.server.service;

import io.getarrays.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

// define functions for the application
public interface ServerService {
    Server create(Server server);

    /**
     * Ping that server with the given ipAddress
     * @param ipAddress
     * @return server with updated status
     */
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}

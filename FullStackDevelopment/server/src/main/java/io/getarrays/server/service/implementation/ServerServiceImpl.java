package io.getarrays.server.service.implementation;

import io.getarrays.server.model.Server;
import io.getarrays.server.repo.ServerRepo;
import io.getarrays.server.service.ServerService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

//Lombook create a constructor and put all fields in the constructor and it s going to be a dependency injection
@RequiredArgsConstructor
@Service
@Transactional
@Slf4j // get logs
public class ServerServiceImpl implements ServerService {
    private final ServerRepo serverRepo;

    @Override
    public Server create(Server server) {
        log.info("Saving new server: {}");
        return null;
    }

    @Override
    public Server ping(String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}

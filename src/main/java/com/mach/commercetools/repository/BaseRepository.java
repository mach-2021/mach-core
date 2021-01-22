package com.mach.commercetools.repository;

import com.mach.commercetools.exception.CTException;
import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.client.SphereRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.concurrent.CompletionStage;

@Repository
@Slf4j
@RequiredArgsConstructor
public class BaseRepository {

    private final BlockingSphereClient sphereClient;

    public <T> CompletionStage<T> execute(SphereRequest<T> sphereRequest) {
        return sphereClient.execute(sphereRequest);
    }

    public <T> T executeBlocking(SphereRequest<T> sphereRequest) {
        return sphereClient.executeBlocking(sphereRequest);
    }

    public <T> CompletionStage<T> executeWithThrowing(SphereRequest<T> sphereRequest) {
        return sphereClient.execute(sphereRequest).exceptionally(this::handleException);
    }

    private <T> T handleException(Throwable e) {
        log.error("Could not execute the request: ", e);
        throw new CTException(e);
    }
}

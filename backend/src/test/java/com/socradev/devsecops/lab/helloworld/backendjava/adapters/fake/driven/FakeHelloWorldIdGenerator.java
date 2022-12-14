package com.socradev.devsecops.lab.helloworld.backendjava.adapters.fake.driven;

import com.socradev.devsecops.lab.helloworld.backendjava.adapters.fake.exceptions.FakeException;
import com.socradev.devsecops.lab.helloworld.backendjava.adapters.fake.exceptions.FakeMessages;
import com.socradev.devsecops.lab.helloworld.backendjava.core.ports.driven.HelloWorldIdGenerator;

import java.util.ArrayDeque;
import java.util.Queue;

public class FakeHelloWorldIdGenerator implements HelloWorldIdGenerator {
    private final Queue<Long> queue;

    public FakeHelloWorldIdGenerator() {
        this.queue = new ArrayDeque<>();
    }

    @Override
    public Long next() {
        if (queue.isEmpty()) {
            throw new FakeException(FakeMessages.GENERATOR_DOES_NOT_HAVE_NEXT);
        }

        return queue.remove();
    }

    public void add(Long value) {
        queue.add(value);
    }
}

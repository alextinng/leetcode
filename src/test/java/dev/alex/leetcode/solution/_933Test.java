package dev.alex.leetcode.solution;

import dev.alex.leetcode.solution._933;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _933Test {
    private _933 instance;

    @Before
    public void setup() {
        instance = new _933();
    }

    @Test
    public void ping() {
        int cnt;

        cnt = instance.ping(1);
        Assert.assertEquals(1, cnt);

        cnt = instance.ping(100);
        Assert.assertEquals(2, cnt);

        cnt = instance.ping(3001);
        Assert.assertEquals(3, cnt);

        cnt = instance.ping(3002);
        Assert.assertEquals(3, cnt);
    }
}
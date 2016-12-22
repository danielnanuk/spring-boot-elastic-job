package me.nielcho.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import me.nielcho.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by daniel on 2016/12/22.
 */
public class SpringSimpleJob implements SimpleJob {

    @Autowired
    MyService myService;


    @Override
    public void execute(ShardingContext context) {
        myService.printContext(context);
        switch (context.getShardingItem()) {
            case 0:
                // do something by sharding item 0
                break;
            case 1:
                // do something by sharding item 1
                break;
            case 2:
                // do something by sharding item 2
                break;
            // case n: ...
        }
    }
}
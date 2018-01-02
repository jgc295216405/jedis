import redis.clients.jedis.JedisPool;

import java.util.ArrayList;
import java.util.List;

public class MainStart {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("jgc");
        list.add("jgc1");
        MyJedisPool.set("list", list);//向key-->name中放入了value-->xinxin
        System.out.print(MyJedisPool.get("list"));

    }
}

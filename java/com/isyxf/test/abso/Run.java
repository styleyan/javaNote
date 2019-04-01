package com.isyxf.test.abso;

public class Run extends Aa {

    private String name = "yxf";

    Run() {}

    Run(String cc) {
        super(cc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 运行测试代码
     *
     * @return
     */
    String runTest() {
        this.getBb();
        return getCc();
    }

    public static void main(String[] args) {
        Run run = new Run("我是舒缓干");
        run.setName("gff");

        System.out.println(run.getName());
        System.out.println(run.runTest());
    }
}

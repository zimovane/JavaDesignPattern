package template.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public class MilitaryComputer extends AbstractComputer{

    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("进行指纹识别等复杂的用户验证");
    }
}

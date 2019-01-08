package strategy_pattern;

/**
 * ����ģʽ�����ࣺ�������㷨�壬�ֱ��װ������������֮���һ�໥�滻��
 * ��ģʽ���㷨�ı仯��������ʹ���㷨�Ŀͻ���
 * 	�������磺Android��recyclerView�е����ü����
 * @author ��С��
 *
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.performFly();
		mallard.performQuauk();
		
		Duck model=new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}

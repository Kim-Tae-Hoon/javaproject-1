public class Television {
	int channel; // ä��
	int volume; // ����
	boolean onOff; // ����
	int uhdtv;
	int hdtv;

	void print() {
		System.out.println("ä����" + channel + "�̰� ������" + volume + "�Դϴ�.");
	}

	int getChannel() {
		return channel;
	}
}
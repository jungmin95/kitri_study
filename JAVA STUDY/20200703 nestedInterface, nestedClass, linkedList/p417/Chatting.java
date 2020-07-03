package p417;

public class Chatting {

	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			final String nickName = chatId;

			@Override
			public void start() {
				while (true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}
}

class TestCase:
    def __init__(self, name):
        self.name = name

    def setup(self):
        pass

    def run(self):
        self.setup()
        method = getattr(self, self.name)
        method()


class WasRun(TestCase):
    def __init__(self, name):
        super().__init__(name)

    def test_method(self):
        self.wasRun = 1

    def setup(self):
        self.wasRun = None
        self.wasSetup = 1

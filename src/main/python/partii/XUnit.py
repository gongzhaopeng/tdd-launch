class TestCase:
    def __init__(self, name):
        self.name = name

    def setup(self):
        pass

    def tear_down(self):
        pass

    def run(self):
        self.setup()
        method = getattr(self, self.name)
        method()
        self.tear_down()


class WasRun(TestCase):
    def __init__(self, name):
        super().__init__(name)

    def setup(self):
        self.log = "setup "

    def test_method(self):
        self.log = self.log + "test_method "

    def tear_down(self):
        self.log = self.log + "tear_down "

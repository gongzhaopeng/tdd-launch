from testcase import TestCase


class WasRun(TestCase):
    def __init__(self, name):
        super().__init__(name)

    def setup(self):
        self.log = "setup "

    def test_method(self):
        self.log = self.log + "test_method "

    def test_broken_method(self):
        raise Exception

    def tear_down(self):
        self.log = self.log + "tear_down "
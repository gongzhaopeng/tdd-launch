from XUnit import TestCase, WasRun


class TestCaseTest(TestCase):
    def setup(self):
        self.test = WasRun("test_method")

    def test_running(self):
        self.test.run()
        assert self.test.wasRun

    def test_setup(self):
        self.test.run()
        assert self.test.wasSetup


TestCaseTest("test_running").run()
TestCaseTest("test_setup").run()

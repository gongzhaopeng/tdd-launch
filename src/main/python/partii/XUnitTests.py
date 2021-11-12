from XUnit import TestCase, WasRun


class TestCaseTest(TestCase):
    def test_running(self):
        test = WasRun("test_method")
        assert not test.wasRun
        test.run()
        assert test.wasRun


TestCaseTest("test_running").run()
